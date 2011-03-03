/**
 * Copyright (c) 2009--2010, Stephan Preibisch & Stephan Saalfeld
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.  Redistributions in binary
 * form must reproduce the above copyright notice, this list of conditions and
 * the following disclaimer in the documentation and/or other materials
 * provided with the distribution.  Neither the name of the Fiji project nor
 * the names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package mpicbg.imglib.img;

import mpicbg.imglib.Interval;
import mpicbg.imglib.Localizable;
import mpicbg.imglib.util.Util;

/**
 * Abstract base class for localizable ImgSamplers.
 * The current position is stored in an int[] field and used to
 * implement the {@link Localizable} interface.
 * This is identical to {@link AbstractLocalizableImgSampler}, except that
 * the position is limited to {@link Integer.MAX_VALUE} in every dimension.
 *  
 * @param <T>
 *
 * @author Stephan Preibisch, Stephan Saalfeld, Tobias Pietzsch
 */
public abstract class AbstractLocalizableImgSamplerInt< T > extends AbstractImgSampler< T > implements Localizable
{
	/**
	 * The {@link Localizable} interface is implemented using the position
	 * stored here. Subclasses use this array to keep track of the position of
	 * the {@link ImgSampler}.
	 */
	final protected int[] position;
	
	public AbstractLocalizableImgSamplerInt( final Interval f )
	{
		super( f.numDimensions() );
		
		position = new int[ n ];
	}
	
	@Override
	public void localize( final float[] pos )
	{
		for ( int d = 0; d < n; d++ )
			pos[ d ] = this.position[ d ];
	}

	@Override
	public void localize( final double[] pos )
	{
		for ( int d = 0; d < n; d++ )
			pos[ d ] = this.position[ d ];
	}

	@Override
	public void localize( int[] pos )
	{
		for ( int d = 0; d < n; d++ )
			pos[ d ] = this.position[ d ];
	}
	
	@Override
	public void localize( long[] pos )
	{
		for ( int d = 0; d < n; d++ )
			pos[ d ] = this.position[ d ];
	}
	
	@Override
	public float getFloatPosition( final int dim ){ return position[ dim ]; }
	
	@Override
	public double getDoublePosition( final int dim ){ return position[ dim ]; }
	
	@Override
	public int getIntPosition( final int dim ){ return position[ dim ]; }

	@Override
	public long getLongPosition( final int dim ){ return position[ dim ]; }
	
	@Override
	public String toString(){ return Util.printCoordinates( position ) + " = " + get(); }
}
