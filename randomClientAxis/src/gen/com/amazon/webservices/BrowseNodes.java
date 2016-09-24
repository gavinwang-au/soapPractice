/**
 * BrowseNodes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gen.com.amazon.webservices;

public class BrowseNodes  implements java.io.Serializable {
    private gen.com.amazon.webservices.Request request;

    private gen.com.amazon.webservices.BrowseNode[] browseNode;

    public BrowseNodes() {
    }

    public BrowseNodes(
           gen.com.amazon.webservices.Request request,
           gen.com.amazon.webservices.BrowseNode[] browseNode) {
           this.request = request;
           this.browseNode = browseNode;
    }


    /**
     * Gets the request value for this BrowseNodes.
     * 
     * @return request
     */
    public gen.com.amazon.webservices.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this BrowseNodes.
     * 
     * @param request
     */
    public void setRequest(gen.com.amazon.webservices.Request request) {
        this.request = request;
    }


    /**
     * Gets the browseNode value for this BrowseNodes.
     * 
     * @return browseNode
     */
    public gen.com.amazon.webservices.BrowseNode[] getBrowseNode() {
        return browseNode;
    }


    /**
     * Sets the browseNode value for this BrowseNodes.
     * 
     * @param browseNode
     */
    public void setBrowseNode(gen.com.amazon.webservices.BrowseNode[] browseNode) {
        this.browseNode = browseNode;
    }

    public gen.com.amazon.webservices.BrowseNode getBrowseNode(int i) {
        return this.browseNode[i];
    }

    public void setBrowseNode(int i, gen.com.amazon.webservices.BrowseNode _value) {
        this.browseNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseNodes)) return false;
        BrowseNodes other = (BrowseNodes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.browseNode==null && other.getBrowseNode()==null) || 
             (this.browseNode!=null &&
              java.util.Arrays.equals(this.browseNode, other.getBrowseNode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getBrowseNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowseNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowseNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrowseNodes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">BrowseNodes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
