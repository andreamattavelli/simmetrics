/*
 * #%L
 * Simmetrics Core
 * %%
 * Copyright (C) 2014 - 2015 Simmetrics Authors
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package org.simmetrics.metrics.costfunctions;

import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.simmetrics.metrics.functions.AffineGap;
import org.simmetrics.metrics.functions.Gap;

@SuppressWarnings("javadoc")
@RunWith(Enclosed.class)
public final class AffineGapTest {

	public static final class AffineGap1_1Over3Test extends GapCostTest {

		@Override
		protected Gap getCost() {
			return new AffineGap(-1f, -1 / 3f);
		}

		@Override
		protected T[] getTests() {
			final String testString = "hello world AAAAAAA BBB ABCDEF this is a test";
			return new T[] { new T(-2.6667f, testString, 0, 6),
					new T(-1.0000f, testString, 3, 4),
					new T(-2.0000f, testString, 13, 17),
					new T(-1.6667f, testString, 19, 22),
					new T(-2.6667f, testString, 23, 29),
					new T(-1.0000f, testString, 5, 6), };
		}
	}

	public static final class AffineGap5_1Test extends GapCostTest {

		@Override
		protected Gap getCost() {
			return new AffineGap(-5.0f, -1.0f);
		}

		@Override
		protected T[] getTests() {
			final String testString = "hello world AAAAAAA BBB ABCDEF this is a test";
			return new T[] { new T(-10.0000f, testString, 0, 6),
					new T(-5.0000f, testString, 3, 4),
					new T(-8.0000f, testString, 13, 17),
					new T(-7.0000f, testString, 19, 22),
					new T(-10.0000f, testString, 23, 29),
					new T(-5.0000f, testString, 5, 6),

			};
		}
	}
}
