package day15;

import java.util.concurrent.*;

public class Future {
	public static void main(String[] args) {
		int corePoolSize = 2;
		int maxPoolSize = 4;
		long keepAliveTime = 10;
		TimeUnit unit = TimeUnit.SECONDS;
		
		BlockingDeque<Runnable> workQueue = new ArrayBlockingQueue<>(2);
		
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		
		RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
		
		try {
			ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, unit, threadFactory, handler))
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
