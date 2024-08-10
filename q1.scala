@main def main()={
    var text="ThisIsTheText";
    println("original text: " + text)
    println("encrypted text: " + encrypt(2,text))
    println("decrypted : " + decrypt(2,text))
    // println(text)
    println("decrypt " + text + " using HO func: " + cypher(2,text,decrypt))
    println("encrypt " + text + " using HO func: " + cypher(2,text,encrypt))
}

def encrypt(n:Int, text: String):String={
    var encrypted:String = "";
    for(i<-text){
        encrypted = encrypted + (i.toInt+n).toChar
    }
    return encrypted;
}

def decrypt(n:Int, text: String):String={
    var encrypted:String = "";
    for(i<-text){
        encrypted = encrypted + (i.toInt-n).toChar
    }
    return encrypted;
}

def cypher(shift:Int, text:String, func:(Int,String)=>String):String={
    func(shift, text)
}
