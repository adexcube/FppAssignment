package fpplesson9;



public class ArrayQueueImpl {
		private int[] arr = new int[10]; 
		private int front = -1;
		private int rear = 0;
		
		
		public int peek() { 
			if (isEmpty()) 
			{
				System.out.println("Queue is empty");
				return -1;
			}
			
			else 
			return arr[front];
		
			}
		
		public void enqueue(int obj){
			if (rear == arr.length)
				resize();
			arr[rear] = obj;
			++rear;
			
			}
		
		public int dequeue() {
		if (isEmpty()) 
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else 
		{
			int count = 0;
			for (int i = 1; i < front; ++i)
			{
				arr[count] = arr[i];
				++count;
			}
			
			--rear;
		}
		return 1;
		}
		
			
		public boolean isEmpty(){ 
			return (front == -1);
		
			
		}
		public int size(){ 
			if (isEmpty()) return 0;
			else
			return rear;
		} 
		private void resize()
		{
			if (rear == arr.length)
			{
				int[] temp = new int[arr.length * 2];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr = temp;
				
				
			}
			
			}
