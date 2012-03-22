<%-- 
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2009 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

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
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.deegree.i18n.Messages" %>
<%@ page import="java.util.Locale" %>
<%
Locale loc = request.getLocale();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>deegree iGeoPortal nominatim search</title>
		
		<link href="../../css/deegree.css" rel="stylesheet" type="text/css" />
		<link href="./css/nominatim_search.css" rel="stylesheet" type="text/css" />
		
		<link rel="stylesheet" type="text/css" href="../../javascript/ext-3.3.1/resources/css/ext-all.css" />
        <link rel="stylesheet" type="text/css" title="blue"  href="../../javascript/ext-3.3.1/resources/css/xtheme-blue.css" /> 
        <link rel="stylesheet" type="text/css" title="gray"  href="../../javascript/ext-3.3.1/resources/css/xtheme-gray.css" />
        <link rel="stylesheet" type="text/css" title="black" href="../../javascript/ext-3.3.1/resources/css/xtheme-access.css" />
        <script type="text/javascript" src="../../javascript/ext-3.3.1/adapter/ext/ext-base.js"></script>
        <script type="text/javascript" src="../../javascript/ext-3.3.1/ext-all.js"></script>
        
		<script type="text/javascript" src="../../javascript/request_handler.js"></script>
        <script type="text/javascript" src="../../javascript/json2.js"></script>
        <script type="text/javascript" src="../../javascript/utils.js"></script>
        <script type="text/javascript" src="../../javascript/envelope.js"></script>
        <script type="text/javascript" src="../../javascript/event.js"></script>
        <script type="text/javascript" src="nominatim_search.js"></script>
        
        <script type="text/javascript">

        var url = null;
        
        function register() {
            if ( parent.controller == null ) {
                parent.controller = new parent.Controller();
                parent.controller.init();
            }               
        }

        function initNominatim_search() {
            parent.controller.initNominatim_search( document );
            var tmp = window.location.pathname.split( '/' );
            var s = '';
            for ( var i = 0; i < tmp.length-3; i++) {
                s += (tmp[i] + '/' ); 
            } 
            url = window.location.protocol + '//' + window.location.host + s + 'ajaxcontrol';
            
            parent.controller.vNominatim_search.setURL( url );

            initGUI();
        }

        /**
         * initializing ExtJS GUI elements. At the moment just Ext.Button elements will be used
         * In future version this dialog will be completly reimplemented as an ExtJS to avoid
         * opening an additional browser window
         */
         function initGUI() {
              Ext.QuickTips.init();   
              new Ext.Button({
                  tooltip: '<%=Messages.get( loc, "IGEO_STD_NOMINATIM_README_DESCRIPTION" ) %>',
                  text: '<%=Messages.get( loc, "IGEO_STD_NOMINATIM_README_DESCRIPTION" ) %>',
                  renderTo: 'buttonArea0',
                  width: 70,
                  height: 20,
                  handler: function(toggled){                               
                	  alert('TODO');
                  }
              });

              new Ext.Button({
                  tooltip: '<%=Messages.get( loc, "IGEO_STD_NOMINATIM_SEARCH_DESCRIPTION" ) %>',
                  text: '<%=Messages.get( loc, "IGEO_STD_NOMINATIM_SEARCH_DESCRIPTION" ) %>',
                  renderTo: 'buttonArea1',
                  width: 45,
                  height: 20,
                  handler: function(toggled){                  
                	  search();
                  }
              });             
           }

        function search() {
        	parent.controller.vNominatim_search.search();
        }
        
        function openLegal() {
            var fiw = window.open( "../../welcome/legal.html", "CopyrightLicense",
                                   "width=830, height=580, left=100, top=100, resizable=no, scrollbars=yes");
            fiw.focus();
        }

        </script>
        
	</head>
	<body onload="register(); initNominatim_search();" class="pNominatim_search">
	<div class="pNominatim_searchQueryLine">
           <div id="buttonArea0"></div>
        </div>
        <div class="pNominatim_searchQueryLine">
        <table border="0">
            <tr>
                <td width="5"></td>
                <td width="120" align="center"><input id="queryString" type="text" name="queryString" value="" style="width:150px"></td>
                <td width="25" align="right"><a href="javascript:openLegal()"><img src="../../images/copyright.gif" border="1" alt="copyright" /></a></td>
                <td width="55" align="left"><div id="buttonArea1"></div></td>
            </tr>
        </table>
        </div>
         <div class="pNominatim_searchResult" id="resultList">
        </div>
    </body>
</html>