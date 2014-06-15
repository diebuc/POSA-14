package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class SimpleAtomicLong
 * 
 * @brief This class implements a subset of the java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
	/**
	 * The value that's manipulated atomically via the methods.
	 */
	private long mValue;

	/**
	 * The ReentrantReadWriteLock used to serialize access to mValue.
	 */

	// TODO -- you fill in here by replacing the null with an
	// initialization of ReentrantReadWriteLock.
	private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();

	/**
	 * Creates a new SimpleAtomicLong with the given initial value.
	 */
	public SimpleAtomicLong(long initialValue)
	{
		// TODO -- you fill in here
		mValue = initialValue;
	}

	/**
	 * @brief Gets the current value.
	 * 
	 * @returns The current value
	 */
	public long get()
	{
		// TODO -- you fill in here
		mRWLock.readLock().lock();
		long value = mValue;
		mRWLock.readLock().unlock();
		return value;
	}

	/**
	 * @brief Atomically decrements by one the current value
	 * 
	 * @returns the updated value
	 */
	public long decrementAndGet()
	{

		// TODO -- you fill in here
		mRWLock.writeLock().lock();
		long value = --mValue;
		mRWLock.writeLock().unlock();
		return value;
	}

	/**
	 * @brief Atomically increments by one the current value
	 * 
	 * @returns the previous value
	 */
	public long getAndIncrement()
	{
		// TODO -- you fill in here
		mRWLock.writeLock().lock();
		long value = mValue;
		mValue++;
		mRWLock.writeLock().unlock();
		return value;
	}

	/**
	 * @brief Atomically decrements by one the current value
	 * 
	 * @returns the previous value
	 */
	public long getAndDecrement()
	{
		// TODO -- you fill in here
		mRWLock.writeLock().lock();
		long value = mValue;
		mValue--;
		mRWLock.writeLock().unlock();
		return value;
	}

	/**
	 * @brief Atomically increments by one the current value
	 * 
	 * @returns the updated value
	 */
	public long incrementAndGet()
	{
		// TODO -- you fill in here
		mRWLock.writeLock().lock();
		long value = ++mValue;
		mRWLock.writeLock().unlock();
		return value;
	}
}