/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ipfs;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IPFSComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IPFSComponent target = (IPFSComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "ipfshost":
        case "ipfsHost": target.setIpfsHost(property(camelContext, java.lang.String.class, value)); return true;
        case "ipfsport":
        case "ipfsPort": target.setIpfsPort(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("ipfsHost", java.lang.String.class);
        answer.put("ipfsPort", int.class);
        answer.put("lazyStartProducer", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IPFSComponent target = (IPFSComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "ipfshost":
        case "ipfsHost": return target.getIpfsHost();
        case "ipfsport":
        case "ipfsPort": return target.getIpfsPort();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}
