package nestedLoops;

public class ANewHope {

	public static void main(String[] args) {
		
		int a,b,c,d,range=50;
		
		for(a=1;a<range;++a)
			for(b=1;b<range;++b)
				for(c=1;c<range;++c)
					for(d=1;d<range;++d) 
						if( a+b+c+d == 45 ) {
							int v1=a+2,v2=b-2,v3=c*2,v4=d/2,q=(v1+v2+v3+v4)/4;
							if( q==v1 && q==v2 && q==v3 && q==v4 ) {
								System.out.println(a+" "+b+" "+c+" "+d);
							}							
						}
						
	}
}
