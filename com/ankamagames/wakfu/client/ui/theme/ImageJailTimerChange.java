package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ImageJailTimerChange implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ImageJailTimerChange() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(65);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("jail_0.tga"));
        checkOut.setWidth(65);
        checkOut.setX(2);
        checkOut.setY(61);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
