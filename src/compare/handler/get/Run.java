/* This file is part of calliope.
 *
 *  calliope is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  calliope is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with calliope.  If not, see <http://www.gnu.org/licenses/>.
 */

package compare.handler.get;

/**
 *
 * @author desmond
 */
public class Run 
{
    /** absolute offset */
    int offset;
    int len;
    Run( int offset, int len )
    {
        this.offset = offset;
        this.len = len;
    }
    int end()
    {
        return this.offset + this.len;
    }
}
