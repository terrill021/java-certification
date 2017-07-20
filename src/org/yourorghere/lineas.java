package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 * SimpleJOGLcpmputacionGrafica.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class lineas implements GLEventListener {

   private static float x = 1;

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new lineas());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!

            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        // Move the "drawing cursor" to another position
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        // Draw A line
        gl.glBegin(GL.GL_LINE_STRIP);
        // Set the current drawing color to light blue
        gl.glColor3f(1.0f, 0.0f, 1.0f);
        gl.glVertex2f(0.0f, 2.0f);
        gl.glVertex2f(1.0f, 2.0f);
        // Done Drawing The Quad
        gl.glEnd();

        gl.glTranslatef(0.0f, 1.0f, 0.0f);
        // Draw A line
        gl.glBegin(GL.GL_LINE_STRIP);
        gl.glColor3f(1.0f, 0.0f, 1.0f);
        gl.glVertex2f(0.0f, 0.0f);
        gl.glVertex2f(1.0f, 0.0f);
        // Set the current drawing color to light blue
        gl.glEnd();

        gl.glTranslatef(1.0f, -0.8f, 0.0f);
        // Draw A Quad
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(1.0f, 0.0f, 0.0f);    // Set the current drawing color to light blue
        gl.glVertex3f(-0.5f, 0.5f, 0.0f);  // Top Left
        gl.glVertex3f(0.5f, 0.5f, 0.0f);   // Top Right
        gl.glVertex3f(0.5f, -0.5f, 0.0f);  // Bottom Right
        gl.glVertex3f(-0.5f, -0.5f, 0.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();

        gl.glTranslatef(1.0f, -0.8f, 0.0f);
        // Draw A rectangle
        gl.glBegin(GL.GL_POINTS);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex2d(0.0d, 0.0d);
        gl.glVertex2d(3.0d, 0.0d);// Set the current drawing color to light blue
        gl.glVertex2d(3.0d, 3.0d);
        gl.glVertex2d(0.0d, 3.0d);
 // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();

         gl.glTranslatef(-3.0f, -0.8f, 0.0f);
        // Draw A rectangle
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex2d(0.0d, 0.0d);
        gl.glVertex2d(2.0d, 0.0d);// Set the current drawing color to light blue
        gl.glVertex2d(2.0d, 1.0d);
        gl.glVertex2d(0.0d, 1.0d);
 // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
//        gl.glTranslatef(-5.0f, 0.0f, -5.0f);
//        // Draw A circle
//        gl.glBegin(GL.GL_POLYGON);
//         gl.glColor3f(1.0f, 1.0f, 0.0f);         
//        for(int i=0;i<100; i++){
//            Float x = (float) Math.cos(i*2*Math.PI/100);
//            Float y = (float) Math.sin(i*2*Math.PI/100);
//            gl.glVertex2f(x, y);
//        }    
//                     
//        gl.glEnd();
        
        // la estrella dde 5 puntas
        gl.glTranslatef(3.0f, -1.0f, 0.0f);
        // Draw A line
        gl.glBegin(GL.GL_LINE_STRIP);
        gl.glColor3f(1.0f, 0.0f, 1.0f);
        gl.glVertex2f(0.2f, 0.0f);
        gl.glVertex2f(0.6f, 1.2f);
        gl.glVertex2f(1.0f, 0.0f);
        gl.glVertex2f(0.0f, 0.7f);
        gl.glVertex2f(1.2f, 0.7f);
        gl.glVertex2f(0.2f, 0.0f);

        // Set the current drawing color to light blue
        gl.glEnd();// fin del aestrella      
            
        gl.glTranslatef(1.0f, 3.0f, 0.0f);      
        GLU glu = new GLU();
        GLUquadric quadric = glu.gluNewQuadric();
        glu.gluSphere(quadric, 0.9f, 60, 50);

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}
