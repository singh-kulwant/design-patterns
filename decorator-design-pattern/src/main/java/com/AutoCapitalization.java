package com;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AutoCapitalization extends FilterInputStream{

	public InputStream inputStream;
	
	protected AutoCapitalization(InputStream in) {
		super(in);
		inputStream = in;
	}
	
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1) ? c : 	Character.toLowerCase((char) c);
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int r = super.read(b, off, len);
		for (int i = off ; i<off+r ; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return r;
	}
	

}
