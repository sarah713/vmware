class sqrt{
    long floorSqrt(long x)
	 {
		// Your code here
		long start=1;
		long end = x;
		
		while(start<=end){
		    long mid =start + (end - start) / 2;
		    
		    if(mid*mid > x){
		        end = mid-1;
		    }else if(mid*mid == x){
		        return mid;
		    }else{
		        start = mid+1;
		    }
		}
		return Math.round(end);
	 }
}