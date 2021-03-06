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

package org.deegree.ogcwebservices.wpvs.capabilities;

import java.net.URL;

/**
 * This class represents a dataprovider object.
 *
 * @author <a href="mailto:mays@lat-lon.de">Judit Mays</a>
 * @author last edited by: $Author$
 *
 * @version 2.0, $Revision$, $Date$
 *
 * @since 2.0
 */
public class DataProvider {

	// TODO move LogoURL to a common package
    private LogoURL logoURL;

	private String providerName;

	private URL providerSite;

    /**
     * Creates a new data provider object from providerName, providerSite and logoUrl.
     *
     * @param providerName
     * @param providerSite
     * @param logoURL
     */
    public DataProvider( String providerName, URL providerSite, LogoURL logoURL ) {
		this.providerName = providerName;
		this.providerSite = providerSite;
		this.logoURL = logoURL;
    }

	/**
	 * @return Returns the logoURL.
	 */
	public LogoURL getLogoURL() {
		return logoURL;
	}

	/**
	 * @return Returns the providerName.
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * @return Returns the providerSite.
	 */
	public URL getProviderSite() {
		return providerSite;
	}

}

