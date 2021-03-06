package com.shsrobotics.library;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

/**
 * Class to hold get and set methods for PID controller.
 * @author Cory McCartan
 */
public abstract class PIDHardware {

	public Source source = new Source();
	public Output output = new Output();
	
	/**
	 * Write a value to the hardware.
	 * @param output the value to write.
	 */
	public abstract void write(double output);
	/**
	 * Read a value from the hardware.
	 * @return the value that was read.
	 */
	public abstract double read();
	
	public class Source implements PIDSource {
		public double pidGet() {
			return read();
		}

		@Override
		public void setPIDSourceType(PIDSourceType pidSource) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public PIDSourceType getPIDSourceType() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public class Output implements PIDOutput {
		public void pidWrite(double output) {
			write(output);
		}
	}
	
}
