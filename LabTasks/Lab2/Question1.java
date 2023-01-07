class Rectangle{
	
	private float length;
	private float width;
	
	Rectangle(){
		length = 1;
		width = 1;
	}
	public float Perimeter(){
		float p = 2*(length+width);
		return p;
	}
	public float Area(){
		float a = (length*width);
		return a;
	}
	public void setLength(float length){
		if(length>0.0&&length<20.0)
		this.length = length;

	}
	public float getLength(){
		return length;
	}
	public void setWidth(float width){
		if(width>0.0&&width<20.0)
		this.width = width;
	}
	public float getWidth(){
		return width;
	}
}