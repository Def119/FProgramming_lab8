@main def main()={
    var text="AZThisIsTheText";
    // println("original text: " + text)
    // println("encrypted text: " + encrypt(2,text))
    // println("decrypted : " + decrypt(2,"AZThisIsTheText"))
    // // println(text)
    text = cypher(2,"Lost",encrypt)
    println("decrypt " + text + " using HO func: " + cypher(3,"xyzA",decrypt))
    println("encrypt " + text + " using HO func: " + cypher(2, "xyzA",encrypt))
}

def encrypt(n:Int, text: String):String={
    var encrypted:String = "";
    
    for(i<-text){                       // can implement with map function too!!
        var lettera = if (i.isUpper) 'A' else 'a'
        encrypted = encrypted + ((i.toInt + n - lettera.toInt)%26 + lettera).toChar
        
    }
    return encrypted;
}

def decrypt(n:Int, text: String):String={
    var decrypted:String = "";
    for(i<-text){
        var lettera = if (i.isUpper) 'A' else 'a'
        decrypted = decrypted + ((i.toInt - n - lettera.toInt + 26)%26 + lettera).toChar
        // println(s"${(i.toInt - n - lettera.toInt + 26)%26} is letter $i and ${i.toInt - n - lettera}\n")
    }
    return decrypted;
}

def cypher(shift:Int, text:String, func:(Int,String)=>String):String={
    func(shift, text)
}
