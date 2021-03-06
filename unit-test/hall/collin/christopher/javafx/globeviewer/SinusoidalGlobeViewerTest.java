/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hall.collin.christopher.javafx.globeviewer;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import javafx.geometry.Point2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cybergnome
 */
public class SinusoidalGlobeViewerTest {
	
	public SinusoidalGlobeViewerTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	
	@Before
	public void setUp() {
		System.out.println(this.getClass().getSimpleName()+": {");
		ForkJoinPool.commonPool().submit(()->{JavaFXInitializer.launch(JavaFXInitializer.class);});
	}
	
	@After
	public void tearDown() {
		System.out.println("} :"+this.getClass().getSimpleName());
		JavaFXInitializer.exit();
	}


	/**
	 * Test of convertLonLatToRelativePixelXY method, of class CuboidGlobeViewer.
	 */
	@Test
	public void testCoordinateConversions() {
		final GlobeViewer gv = new SinusoidalGlobeViewer();
		MercatorGlobeViewerTest.doCoordinateTestOn(gv);
	}
}
