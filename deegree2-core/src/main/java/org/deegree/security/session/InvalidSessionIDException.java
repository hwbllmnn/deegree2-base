//$HeadURL$
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
   Department of Geography, University of Bonn
 and
   lat/lon GmbH

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
----------------------------------------------------------------------------*/
package org.deegree.security.session;

/**
 * This exception shall be thrown when a session(ID) will be used that has been expired.
 *
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth </a>
 * @author last edited by: $Author$
 *
 * @version 1.1, $Revision$, $Date$
 *
 * @since 1.1
 */
public class InvalidSessionIDException extends Exception {

    private static final long serialVersionUID = 2629380655778977531L;

    /**
     *
     */
    public InvalidSessionIDException() {
        super();
    }

    /**
     * @param arg0
     */
    public InvalidSessionIDException( String arg0 ) {
        super( arg0 );
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InvalidSessionIDException( String arg0, Throwable arg1 ) {
        super( arg0, arg1 );
    }

    /**
     * @param arg0
     */
    public InvalidSessionIDException( Throwable arg0 ) {
        super( arg0 );
    }
}