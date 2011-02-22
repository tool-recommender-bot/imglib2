package mpicbg.imglib.algorithm.math;

import mpicbg.imglib.type.Type;

public interface Function<S extends Type<S>, T extends Type<T>, U extends Type<U>>
{
	/** Perform an operation with inputs S and T and output U. */
	public void compute(S s, T t, U u);
}