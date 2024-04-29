
// class Test<T> {
	
// 	T obj;

// 	Test(T obj) { 
//         this.obj = obj; 
//     }

// 	public T getObject() { 
//         return this.obj; 
//     }
// }


// class generics {
// 	public static void main(String[] args)
// 	{
		
// 		Test<Integer> iObj = new Test<Integer>(15);
// 		System.out.println(iObj.getObject());
// 		Test<String> sObj = new Test<String>("GeeksForGeeks");
// 		System.out.println(sObj.getObject());
// 	}
// }


class Generic<T>{
    T obj;

    Generic(T obj){
        this.obj = obj;
    }

    public T getobject(){
        return this.obj;
    }
}

class generics{
    public static void main(String[] args) {
        Generic<Integer> gen = new Generic<Integer>(15);
        System.out.println(gen.getobject());

        Generic<String> ob = new Generic<String>("Ayush jha");
        System.out.println(ob.getobject());
    }


}

