/*
 * DomToplevelNode.java
 * Copyright (c) 2004, 2005 Torbj�rn Gannholm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */
package org.xhtmlrenderer.layout.content;

import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xhtmlrenderer.css.newmatch.CascadedStyle;
import org.xhtmlrenderer.layout.Context;


/**
 * Represents the document (or perhaps a DocumentFragment). This is the starting
 * point, the content object that should be created by anyone using the content
 * model. Don't forget to set the EmptyStyle to the Context.
 *
 * @author   Torbj�rn Gannholm
 */
public class DomToplevelNode implements Content {
    /** Description of the Field */
    private Node _node;

    /**
     * Constructor for the DomToplevelNode object
     *
     * @param node  PARAM
     */
    public DomToplevelNode( Node node ) {
        _node = node;
    }

    /**
     * Converts to a String representation of the object.
     *
     * @return   A string representation of the object.
     */
    public String toString() {
        return "Body: " + _node.getNodeName();
    }

    /**
     * Gets the element attribute of the DomToplevelNode object
     *
     * @return   The element value
     */
    public Element getElement() {
        return null;
    }

    /**
     * Gets the style attribute of the DomToplevelNode object
     *
     * @return   The style value
     */
    public CascadedStyle getStyle() {
        return null;
    }

    /**
     * Gets the childContent attribute of the DomToplevelNode object
     *
     * @param c  PARAM
     * @return   The childContent value
     */
    public List getChildContent( Context c ) {
        return ContentUtil.getChildContentList( c, this );
    }

    /**
     * Gets the node attribute of the DomToplevelNode object
     *
     * @return   The node value
     */
    Node getNode() {
        return _node;
    }

}
