package net.mathieu.perso;


public class ThugLife {

	private static byte[] byteStr = new  byte[] {
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 58, 58, 58, 58, 47, 121, 100, 109, 109, 100, 100, 109, 104, 121, 111, 43, 47, 58, 45, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 58, 43, 47, 96, 96, 96, 96, 46, 47, 115, 47, 47, 111, 121, 115, 100, 78, 77, 77, 109, 43, 43, 121, 121, 47, 46, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 46, 46, 46, 96, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 58, 43, 46, 96, 46, 45, 47, 111, 115, 109, 100, 109, 78, 78, 104, 104, 78, 77, 100, 78, 77, 77, 109, 58, 45, 109, 78, 78, 58, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 43, 115, 43, 43, 111, 115, 58, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 45, 43, 46, 96, 47, 100, 109, 115, 111, 43, 58, 45, 43, 104, 77, 109, 115, 46, 58, 100, 77, 77, 77, 77, 77, 78, 115, 43, 115, 78, 109, 115, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 45, 121, 46, 96, 96, 96, 111, 47, 45, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 47, 45, 96, 96, 96, 111, 121, 47, 46, 46, 43, 121, 109, 78, 109, 115, 46, 96, 96, 96, 96, 111, 109, 111, 43, 77, 77, 78, 46, 46, 78, 100, 104, 109, 43, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 58, 115, 45, 96, 45, 45, 111, 58, 47, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 43, 46, 45, 58, 46, 45, 43, 47, 46, 45, 45, 96, 96, 46, 58, 46, 96, 45, 111, 104, 121, 47, 46, 43, 121, 104, 115, 109, 78, 46, 47, 77, 77, 77, 77, 77, 47, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 45, 58, 43, 111, 121, 121, 47, 96, 47, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 47, 58, 96, 58, 78, 78, 78, 104, 111, 115, 111, 45, 46, 45, 47, 115, 121, 109, 78, 77, 77, 77, 77, 109, 115, 115, 47, 43, 45, 58, 96, 115, 100, 78, 109, 109, 77, 78, 111, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 111, 96, 58, 43, 58, 96, 96, 43, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 43, 96, 96, 104, 77, 104, 45, 46, 96, 96, 96, 96, 45, 58, 45, 115, 109, 104, 109, 109, 104, 115, 43, 45, 46, 96, 96, 96, 96, 96, 96, 96, 96, 43, 111, 104, 77, 77, 104, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 111, 96, 46, 115, 111, 47, 96, 43, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 111, 58, 58, 47, 43, 58, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 43, 109, 77, 77, 100, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 111, 96, 96, 96, 96, 96, 96, 43, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 43, 47, 109, 109, 43, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 111, 77, 77, 100, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 115, 96, 96, 96, 96, 46, 96, 47, 46, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 115, 111, 115, 121, 43, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 104, 78, 77, 100, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 111, 96, 46, 46, 47, 111, 111, 46, 43, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 45, 104, 121, 78, 78, 100, 47, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 47, 109, 77, 78, 111, 46, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 111, 46, 115, 121, 121, 115, 43, 96, 115, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 121, 109, 78, 78, 100, 47, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 121, 77, 77, 77, 77, 109, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 43, 45, 45, 47, 111, 43, 45, 96, 111, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 115, 77, 77, 109, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 58, 96, 96, 96, 96, 96, 96, 96, 45, 47, 43, 115, 121, 121, 111, 100, 77, 77, 77, 77, 77, 45, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 111, 96, 96, 46, 96, 96, 96, 111, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 58, 47, 104, 77, 100, 96, 96, 96, 96, 96, 45, 47, 115, 104, 104, 121, 121, 115, 115, 58, 58, 96, 96, 96, 46, 111, 104, 109, 78, 77, 77, 78, 78, 77, 77, 77, 77, 77, 77, 77, 77, 58, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 46, 121, 96, 96, 96, 96, 96, 96, 111, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 115, 47, 45, 111, 109, 43, 96, 96, 45, 111, 115, 111, 121, 109, 78, 77, 78, 77, 78, 109, 45, 96, 96, 96, 115, 77, 78, 100, 111, 104, 104, 43, 111, 78, 78, 77, 77, 77, 77, 77, 77, 115, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 47, 43, 47, 43, 109, 96, 96, 96, 96, 96, 96, 121, 58, 43, 58, 58, 45, 32, 32, 32, 32, 32, 32, 96, 43, 58, 111, 58, 45, 46, 96, 96, 46, 46, 45, 121, 121, 104, 104, 115, 45, 104, 47, 46, 96, 45, 96, 96, 111, 77, 47, 46, 45, 46, 96, 96, 45, 47, 45, 58, 121, 77, 77, 77, 77, 111, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 96, 121, 46, 96, 96, 96, 104, 96, 96, 96, 96, 96, 96, 111, 43, 45, 46, 46, 58, 111, 96, 32, 32, 32, 32, 32, 47, 43, 104, 47, 45, 58, 96, 96, 96, 96, 96, 46, 96, 96, 46, 45, 58, 58, 96, 96, 96, 47, 45, 96, 45, 100, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 46, 78, 77, 77, 109, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 45, 58, 96, 96, 96, 96, 104, 96, 96, 96, 96, 96, 96, 58, 121, 96, 96, 96, 96, 43, 43, 58, 45, 45, 46, 32, 47, 111, 47, 45, 96, 96, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 46, 121, 43, 111, 46, 96, 96, 96, 96, 96, 96, 96, 96, 104, 77, 77, 47, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 43, 43, 46, 58, 46, 46, 104, 96, 96, 96, 96, 96, 46, 43, 115, 58, 96, 111, 47, 43, 115, 121, 45, 45, 43, 111, 46, 43, 46, 58, 46, 96, 47, 47, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 45, 96, 96, 96, 121, 115, 115, 104, 45, 96, 96, 96, 96, 96, 96, 96, 121, 77, 104, 10,
		32, 32, 32, 32, 32, 32, 32, 45, 104, 100, 96, 46, 96, 96, 45, 96, 96, 96, 96, 96, 96, 47, 115, 96, 96, 96, 96, 45, 111, 43, 46, 96, 111, 115, 104, 45, 45, 47, 45, 96, 111, 45, 43, 47, 96, 96, 96, 96, 96, 96, 46, 43, 43, 58, 45, 58, 46, 96, 96, 43, 121, 121, 78, 100, 46, 96, 96, 96, 96, 96, 96, 100, 78, 45, 10,
		32, 32, 32, 32, 32, 32, 47, 111, 58, 115, 96, 96, 96, 96, 121, 58, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 46, 96, 96, 96, 46, 47, 115, 32, 96, 58, 58, 43, 111, 96, 111, 58, 96, 96, 96, 96, 46, 100, 100, 96, 96, 46, 115, 121, 121, 121, 78, 77, 77, 77, 77, 115, 115, 46, 96, 96, 96, 47, 77, 43, 10,
		32, 32, 32, 32, 45, 111, 47, 96, 96, 104, 111, 96, 96, 111, 45, 47, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 45, 58, 96, 58, 45, 46, 96, 115, 96, 32, 32, 96, 46, 43, 45, 96, 96, 96, 96, 46, 96, 43, 77, 43, 96, 96, 96, 96, 46, 58, 111, 100, 78, 78, 78, 109, 104, 78, 58, 96, 96, 45, 109, 109, 96, 10,
		32, 32, 32, 58, 100, 111, 96, 96, 96, 121, 43, 96, 96, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 104, 45, 96, 46, 45, 46, 58, 121, 32, 32, 32, 32, 32, 46, 104, 46, 96, 96, 96, 43, 46, 45, 104, 121, 100, 111, 47, 47, 58, 58, 47, 58, 58, 47, 43, 121, 77, 121, 96, 96, 96, 104, 77, 47, 10,
		32, 32, 45, 100, 115, 45, 96, 96, 96, 121, 47, 58, 115, 46, 96, 96, 96, 47, 45, 96, 96, 96, 96, 96, 96, 96, 96, 46, 109, 96, 96, 96, 96, 96, 121, 109, 96, 32, 32, 32, 58, 104, 78, 115, 45, 96, 96, 46, 47, 96, 96, 46, 111, 100, 100, 104, 121, 115, 121, 121, 100, 109, 78, 78, 109, 115, 96, 96, 46, 78, 104, 10,
		32, 32, 45, 111, 96, 96, 96, 96, 96, 104, 47, 96, 111, 45, 96, 96, 96, 45, 121, 96, 96, 96, 96, 96, 96, 96, 96, 46, 100, 96, 96, 96, 96, 96, 45, 100, 96, 96, 58, 121, 78, 77, 100, 46, 111, 43, 96, 96, 96, 96, 96, 96, 96, 45, 115, 109, 109, 104, 104, 104, 115, 115, 121, 115, 78, 58, 96, 96, 47, 77, 43, 10,
		32, 32, 32, 45, 47, 96, 96, 96, 58, 109, 45, 96, 96, 96, 96, 96, 96, 96, 111, 47, 96, 96, 96, 96, 96, 96, 96, 46, 100, 96, 96, 96, 96, 96, 46, 100, 111, 100, 77, 77, 77, 77, 78, 46, 96, 58, 43, 58, 96, 96, 96, 96, 96, 96, 96, 45, 111, 43, 47, 58, 47, 47, 43, 109, 115, 96, 96, 96, 121, 104, 96, 46, 10,
		32, 32, 32, 32, 47, 45, 96, 96, 58, 43, 96, 96, 96, 96, 96, 96, 96, 96, 45, 121, 96, 96, 96, 96, 96, 96, 96, 96, 115, 96, 96, 96, 96, 96, 96, 100, 77, 77, 77, 77, 77, 77, 77, 104, 96, 96, 96, 58, 111, 58, 96, 96, 96, 96, 96, 96, 45, 43, 121, 121, 121, 121, 47, 45, 96, 96, 96, 43, 78, 45, 96, 96, 46, 96, 96, 10,
		32, 32, 32, 32, 96, 115, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 111, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 121, 77, 77, 77, 77, 77, 77, 77, 77, 104, 46, 96, 96, 96, 58, 43, 47, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 43, 100, 100, 45, 96, 96, 96, 96, 46, 45, 46, 10,
		32, 32, 32, 32, 32, 47, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 43, 77, 77, 77, 77, 77, 77, 77, 77, 77, 100, 58, 96, 96, 96, 96, 46, 47, 43, 45, 46, 96, 96, 96, 96, 96, 96, 96, 46, 58, 111, 43, 46, 111, 46, 45, 45, 46, 96, 96, 45, 100, 104, 111, 58, 46, 96, 10,
		32, 32, 32, 32, 32, 45, 43, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 43, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 78, 111, 45, 96, 96, 96, 96, 96, 58, 47, 43, 47, 47, 47, 43, 115, 115, 43, 47, 45, 46, 96, 104, 104, 109, 109, 100, 115, 47, 45, 58, 100, 77, 77, 78, 104, 111, 45, 96, 10,
		32, 32, 32, 32, 32, 32, 58, 47, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 104, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 104, 104, 111, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 47, 121, 121, 115, 121, 121, 43, 100, 121, 78, 78, 100, 111, 109, 109, 43, 47, 78, 77, 77, 77, 77, 77, 109, 115, 45, 96, 10,
		32, 32, 32, 32, 32, 32, 32, 96, 45, 58, 47, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 111, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 115, 43, 121, 47, 46, 96, 96, 96, 96, 96, 96, 46, 121, 78, 111, 45, 46, 58, 43, 104, 100, 109, 78, 121, 100, 46, 46, 47, 46, 96, 47, 78, 77, 77, 77, 77, 77, 77, 77, 109, 47, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 58, 47, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 43, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 115, 58, 100, 121, 58, 96, 96, 96, 46, 58, 100, 100, 78, 78, 78, 100, 47, 58, 58, 58, 47, 111, 104, 78, 46, 96, 96, 96, 96, 96, 43, 77, 77, 77, 77, 77, 77, 77, 77, 78, 47, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 96, 43, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 45, 109, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 121, 45, 121, 78, 104, 111, 43, 104, 109, 47, 96, 45, 47, 121, 109, 78, 78, 78, 109, 100, 104, 115, 100, 96, 96, 96, 96, 96, 96, 96, 115, 77, 77, 77, 77, 77, 77, 77, 77, 78, 45, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 58, 58, 47, 45, 45, 45, 96, 96, 96, 96, 96, 96, 96, 96, 115, 47, 96, 96, 47, 78, 104, 121, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 100, 45, 47, 109, 78, 109, 121, 46, 96, 96, 96, 96, 96, 45, 43, 121, 43, 47, 47, 111, 104, 109, 96, 96, 96, 96, 96, 96, 96, 46, 109, 77, 77, 77, 77, 77, 77, 77, 77, 109, 46, 10,
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 46, 104, 78, 111, 46, 96, 96, 96, 96, 96, 96, 96, 46, 46, 47, 115, 121, 47, 96, 111, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 78, 43, 46, 47, 45, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 47, 104, 100, 115, 100, 78, 47, 96, 96, 96, 96, 96, 96, 96, 43, 77, 77, 77, 77, 77, 77, 77, 77, 77, 115, 10,
		32, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 45, 78, 100, 46, 96, 96, 96, 96, 96, 46, 43, 111, 111, 43, 45, 96, 46, 43, 78, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 115, 46, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 104, 104, 109, 104, 43, 43, 121, 45, 96, 96, 96, 96, 96, 46, 109, 77, 77, 77, 77, 77, 77, 77, 77, 78, 58, 96, 96, 96, 96, 96, 10,
		58, 121, 43, 43, 43, 43, 43, 43, 43, 43, 43, 111, 104, 43, 43, 43, 43, 121, 77, 121, 43, 43, 43, 115, 104, 121, 115, 115, 111, 43, 104, 121, 43, 111, 121, 121, 109, 77, 77, 78, 100, 115, 111, 43, 111, 115, 100, 78, 77, 77, 77, 77, 77, 77, 78, 111, 43, 43, 43, 115, 47, 96, 58, 121, 43, 43, 43, 43, 109, 77, 115, 43, 111, 115, 121, 115, 43, 43, 104, 115, 43, 43, 115, 121, 121, 121, 121, 78, 77, 77, 77, 77, 100, 43, 43, 43, 43, 115, 43, 10,
		111, 111, 32, 32, 32, 32, 32, 32, 32, 32, 32, 45, 109, 32, 32, 32, 32, 47, 77, 96, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 104, 45, 32, 32, 32, 96, 32, 32, 32, 45, 100, 77, 77, 77, 77, 77, 109, 32, 32, 32, 32, 43, 121, 46, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 32, 32, 32, 32, 109, 58, 32, 32, 32, 32, 32, 32, 32, 109, 77, 100, 111, 43, 100, 32, 32, 32, 32, 43, 104, 46, 10,
		47, 104, 111, 111, 46, 32, 32, 32, 32, 111, 111, 115, 109, 32, 32, 32, 32, 47, 77, 96, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 46, 32, 32, 32, 45, 78, 45, 32, 32, 32, 45, 77, 77, 77, 77, 77, 109, 32, 32, 32, 32, 43, 109, 47, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 96, 115, 115, 115, 78, 58, 32, 32, 32, 32, 115, 111, 111, 109, 104, 46, 32, 96, 109, 32, 32, 32, 32, 111, 100, 47, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 96, 78, 121, 121, 109, 32, 32, 32, 32, 47, 109, 96, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 96, 32, 32, 32, 58, 77, 58, 96, 96, 96, 96, 77, 77, 77, 77, 77, 109, 32, 32, 32, 32, 43, 109, 47, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 46, 77, 78, 100, 78, 58, 32, 32, 32, 32, 78, 104, 115, 111, 58, 96, 32, 32, 78, 96, 32, 32, 32, 121, 104, 58, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 32, 78, 115, 104, 109, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 96, 32, 32, 32, 58, 78, 109, 100, 100, 100, 100, 77, 77, 77, 77, 77, 109, 32, 32, 32, 32, 43, 109, 47, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 32, 45, 45, 47, 77, 58, 32, 32, 32, 32, 45, 45, 58, 78, 32, 32, 32, 32, 109, 46, 32, 32, 32, 104, 104, 45, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 32, 78, 115, 121, 109, 32, 32, 32, 32, 32, 96, 32, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 96, 32, 32, 32, 58, 111, 32, 32, 32, 32, 96, 77, 77, 78, 121, 121, 109, 32, 32, 32, 32, 43, 109, 47, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 32, 96, 96, 58, 77, 58, 32, 32, 32, 32, 96, 96, 46, 78, 43, 32, 32, 32, 104, 45, 32, 32, 32, 109, 121, 46, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 96, 78, 115, 58, 109, 32, 32, 32, 32, 47, 77, 96, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 121, 32, 32, 32, 32, 121, 77, 96, 32, 32, 32, 58, 109, 58, 32, 32, 32, 96, 77, 121, 96, 32, 46, 109, 32, 32, 32, 32, 43, 109, 47, 43, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 46, 77, 100, 104, 78, 58, 32, 32, 32, 32, 77, 100, 104, 121, 111, 32, 32, 32, 121, 47, 32, 32, 32, 78, 115, 96, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 96, 78, 115, 46, 109, 32, 32, 32, 32, 47, 77, 96, 32, 32, 32, 58, 77, 115, 32, 32, 32, 32, 104, 115, 32, 32, 32, 32, 104, 77, 96, 32, 32, 32, 45, 77, 47, 32, 32, 32, 96, 77, 115, 96, 32, 46, 109, 32, 32, 32, 32, 43, 109, 121, 104, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 46, 78, 111, 32, 104, 58, 32, 32, 32, 32, 78, 104, 111, 111, 46, 32, 32, 32, 121, 121, 43, 43, 43, 78, 115, 96, 10,
		32, 32, 32, 104, 58, 32, 32, 32, 96, 78, 115, 46, 109, 32, 32, 32, 32, 47, 77, 96, 32, 32, 32, 58, 78, 109, 96, 32, 32, 32, 45, 45, 32, 32, 32, 46, 109, 109, 43, 32, 32, 32, 96, 47, 96, 32, 32, 32, 96, 77, 115, 32, 32, 46, 109, 32, 32, 32, 32, 32, 32, 32, 115, 115, 32, 32, 32, 32, 104, 77, 46, 32, 32, 32, 46, 78, 111, 32, 104, 58, 32, 32, 32, 32, 32, 32, 32, 115, 111, 32, 32, 32, 78, 96, 32, 32, 32, 104, 111, 96, 10,
		46, 46, 96, 121, 43, 45, 45, 45, 58, 78, 115, 45, 109, 45, 45, 45, 45, 111, 77, 58, 45, 45, 45, 43, 109, 115, 121, 111, 58, 46, 96, 96, 46, 58, 111, 100, 121, 111, 111, 115, 47, 46, 96, 46, 47, 121, 45, 45, 58, 77, 115, 32, 32, 46, 109, 45, 45, 45, 45, 45, 45, 45, 121, 121, 45, 45, 45, 45, 100, 77, 47, 45, 45, 45, 47, 78, 111, 32, 104, 43, 45, 45, 45, 45, 45, 45, 45, 121, 100, 58, 32, 32, 109, 58, 45, 45, 45, 100, 104, 46, 10,
		43, 47, 58, 45, 47, 47, 115, 121, 121, 115, 111, 45, 58, 58, 47, 115, 115, 115, 115, 43, 58, 115, 115, 115, 111, 58, 32, 96, 58, 43, 115, 104, 104, 121, 115, 43, 58, 96, 32, 32, 45, 43, 115, 121, 121, 115, 111, 47, 115, 111, 43, 32, 32, 32, 45, 58, 47, 115, 115, 115, 115, 115, 115, 115, 47, 43, 115, 115, 115, 111, 47, 58, 111, 115, 115, 111, 47, 32, 96, 58, 58, 111, 115, 115, 115, 115, 115, 115, 111, 45, 32, 32, 46, 58, 58, 111, 115, 115, 43, 46, 10
		};

	public static void main(String[] args) {
		draw();
	}

	public static void draw() {
		String str = ""
		  		  + "                                           .::::/ydmmddmhyo+/:-`\n"
				  + "                                         :+/````./s//oysdNMMm++yy/.\n"
				  + "              `...`                   `:+.`.-/osmdmNNhhNMdNMMm:-mNN:\n"
				  + "             +s++os:                 -+.`/dmso+:-+hMms.:dMMMMMNs+sNms`\n"
				  + "            -y.```o/-              `/-```oy/..+ymNms.````omo+MMN..Ndhm+`\n"
				  + "            :s-`--o:/              +.-:.-+/.--``.:.`-ohy/.+yhsmN./MMMMM/\n"
				  + "            -:+oyy/`/             /:`:NNNhoso-.-/symNMMMMmss/+-:`sdNmmMNo\n"
				  + "            .o`:+:``+             +``hMh-.````-:-smhmmhs+-.````````+ohMMh\n"
				  + "             o`.so/`+             o::/+:``````````.`````````````````+mMMd\n"
				  + "             o``````+             +/mm+``````````````````````````````oMMd\n"
				  + "             s````.`/.            sosy+``````````````````````````````hNMd\n"
				  + "             o`../oo.+            -hyNNd/````````````````````````````/mMNo.\n"
				  + "             o.syys+`s             ymNNd/````````````````````````````yMMMMm`\n"
				  + "             +--/o+-`o             sMMm.``````````````:```````-/+syyodMMMMM-\n"
				  + "             `o``.```o           `:/hMd`````-/shhyyss::```.ohmNMMNNMMMMMMMM:\n"
				  + "            ..y``````o           .s/-om+``-osoymNMNMNm-```sMNdohh+oNNMMMMMMs\n"
				  + "         ./+/+m``````y:+::-      `+:o:-.``..-yyhhs-h/.`-``oM/.-.``-/-:yMMMMo\n"
				  + "        `y.```h``````o+-..:o`     /+h/-:`````.``.-::```/-`-d-`````````.NMMm`\n"
				  + "        -:````h``````:y````++:--. /o/-``.`````````````````.y+o.````````hMM/\n"
				  + "        ++.:..h`````.+s:`o/+sy--+o.+.:.`//.````````````-```yssh-```````yMh\n"
				  + "       -hd`.``-``````/s````-o+.`osh--/-`o-+/``````.++:-:.``+yyNd.``````dN-\n"
				  + "      /o:s````y:`````````````.```./s `::+o`o:````.dd``.syyyNMMMMss.```/M+\n"
				  + "    -o/``ho``o-/````````````-:`:-.`s`  `.+-````.`+M+````.:odNNNmhN:``-mm`\n"
				  + "   :do```y+``.``````````````h-`.-.:y     .h.```+.-hydo//::/::/+yMy```hM/\n"
				  + "  -ds-```y/:s.```/-````````.m`````ym`   :hNs-``./``.oddhysyydmNNms``.Nh\n"
				  + "  -o`````h/`o-```-y````````.d`````-d``:yNMd.o+```````-smmhhhssysN:``/M+\n"
				  + "   -/```:m-```````o/```````.d`````.dodMMMMN.`:+:```````-o+/://+ms```yh`.\n"
				  + "    /-``:+````````-y````````s``````dMMMMMMMh```:o:``````-+yyyy/-```+N-``.``\n"
				  + "    `s`````````````o```````````````yMMMMMMMMh.```:+/-`````````````+dd-````.-.\n"
				  + "     /-````````````````````````````+MMMMMMMMMd:````./+-.```````.:o+.o.--.``-dho:.`\n"
				  + "     -+````````````````````````````+MMMMMMMMMMNo-`````:/+///+ss+/-.`hhmmds/-:dMMNho-`\n"
				  + "      :/-``````````````````````````hMMMMMMMMMMMhho-``````````/yysyy+dyNNdomm+/NMMMMMms-`\n"
				  + "       `-:/.``````````````````````oMMMMMMMMMMMMMs+y/.``````.yNo-.:+hdmNyd../.`/NMMMMMMMm/\n"
				  + "          `:/.```````````````````+MMMMMMMMMMMMMMMs:dy:```.:ddNNNd/:::/ohN.`````+MMMMMMMMN/\n"
				  + "            `+-`````````````````-mMMMMMMMMMMMMMMMMy-yNho+hm/`-/ymNNNmdhsd```````sMMMMMMMMN-\n"
				  + "              ::/---````````s/``/NhyMMMMMMMMMMMMMMMd-/mNmy.`````-+y+//ohm```````.mMMMMMMMMm.\n"
				  + "                .hNo.```````../sy/`oMMMMMMMMMMMMMMMMN+./-``````````/hdsdN/```````+MMMMMMMMMs\n"
				  + " ````````````````-Nd.`````.+oo+-`.+NMMMMMMMMMMMMMMMMMMs.````````````hhmh++y-`````.mMMMMMMMMN:`````\n"
				  + ":y+++++++++oh++++yMy+++shysso+hy+oyymMMNdso+osdNMMMMMMNo+++s/`:y++++mMs+osys++hs++syyyyNMMMMd++++s+\n"
				  + "oo         -m    /M`   :Ms    hy    yMh-   `   -dMMMMMm    +y.+s    hM.       m:       mMdo+d    +h.\n"
				  + "/hoo.    oosm    /M`   :Ms    hy    yM.   -N-   -MMMMMm    +m/+s    hM.   `sssN:    soomh. `m    od/\n"
				  + "   h:   `Nyym    /m`   :Ms    hy    yM`   :M:````MMMMMm    +m/+s    hM.   .MNdN:    Nhso:`  N`   yh:\n"
				  + "   h:    Nshm          :Ms    hy    yM`   :NmddddMMMMMm    +m/+s    hM.    --/M:    --:N    m.   hh-\n"
				  + "   h:    Nsym     `    :Ms    hy    yM`   :o    `MMNyym    +m/+s    hM.    ``:M:    ``.N+   h-   my.\n"
				  + "   h:   `Ns:m    /M`   :Ms    hy    yM`   :m:   `My` .m    +m/+s    hM.   .MdhN:    Mdhyo   y/   Ns`\n"
				  + "   h:   `Ns.m    /M`   :Ms    hs    hM`   -M/   `Ms` .m    +myhs    hM.   .No h:    Nhoo.   yy+++Ns`\n"
				  + "   h:   `Ns.m    /M`   :Nm`   --   .mm+   `/`   `Ms  .m       ss    hM.   .No h:       so   N`   ho`\n"
				  + "..`y+---:Ns-m----oM:---+msyo:.``.:odyoos/.`./y--:Ms  .m-------yy----dM/---/No h+-------yd:  m:---dh.\n"
				  + "+/:-//syyso-::/ssss+:ssso: `:+shhys+:`  -+syyso/so+   -:/sssssss/+ssso/:osso/ `::osssssso-  .::oss+.\n";
		System.out.println(str);
		System.out.println();

		for (byte b : str.getBytes()) {
			System.out.print(b + ",");
			if (b == "\n".getBytes()[0]) {
				//System.out.println();
			}
		}
		System.out.println();

		System.out.println(new String(byteStr));
	}
}
