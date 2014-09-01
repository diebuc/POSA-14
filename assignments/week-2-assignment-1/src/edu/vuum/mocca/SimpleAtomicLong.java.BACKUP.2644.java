// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 * 
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
<<<<<<< HEAD
class SimpleAtomicLong {
	/**
	 * The value that's manipulated atomically via the methods.
	 */
	private long mValue;

	/**
	 * The ReentrantReadWriteLock used to serialize access to mValue.
	 */

	// TODO -- you fill in here by replacing the null with an
	// initialization of ReentrantReadWriteLock.
	private final ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
	private final Lock readLock = mRWLock.readLock();
	private final Lock writeLock = mRWLock.writeLock();

	/**
	 * Creates a new SimpleAtomicLong with the given initial value.
	 */
	public SimpleAtomicLong(long initialValue) {
		// TODO -- you fill in here
		mValue = initialValue;
	}

	/**
	 * @brief Gets the current value.
	 * 
	 * @returns The current value
	 */
	public long get() {
		long value;

		// TODO -- you fill in here
		try {
			readLock.lock();
			value = mValue;
		} finally {
			readLock.unlock();
		}

		return value;

	}

	/**
	 * @brief Atomically decrements by one the current value
	 * 
	 * @returns the updated value
	 */
	public long decrementAndGet() {
		long value = 0;

		// TODO -- you fill in here
		try {
			writeLock.lock();
			mValue--;
			value = mValue;
		} finally {
			writeLock.unlock();
		}

		return value;
	}

	/**
	 * @brief Atomically increments by one the current value
	 * 
	 * @returns the previous value
	 */
	public long getAndIncrement() {
		long value = 0;

		// TODO -- you fill in here
		try {
			writeLock.lock();
			value = mValue;
			mValue++;
		} finally {
			writeLock.unlock();
		}

		return value;
	}

	/**
	 * @brief Atomically decrements by one the current value
	 * 
	 * @returns the previous value
	 */
	public long getAndDecrement() {
		long value = 0;

		// TODO -- you fill in here

		try {
			writeLock.lock();
			value = mValue;
			mValue--;
		} finally {
			writeLock.unlock();
		}

		return value;
	}

	/**
	 * @brief Atomically increments by one the current value
	 * 
	 * @returns the updated value
	 */
	public long incrementAndGet() {
		long value = 0;

		try {
			writeLock.lock();
			mValue++;
			value = mValue;
		} finally {
			writeLock.unlock();
		}

		return value;
	}
=======
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // TODO - you fill in here
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet() {
        // TODO - you fill in here
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement() {
        // TODO - you fill in here
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement() {
        // TODO - you fill in here
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet() {
        // TODO - you fill in here
    }
>>>>>>> 37db7437cc08183a4218b502cf74aae887449b3b
}
