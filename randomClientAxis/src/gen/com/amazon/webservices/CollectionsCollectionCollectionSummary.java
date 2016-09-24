/**
 * CollectionsCollectionCollectionSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gen.com.amazon.webservices;

public class CollectionsCollectionCollectionSummary  implements java.io.Serializable {
    private gen.com.amazon.webservices.Price lowestListPrice;

    private gen.com.amazon.webservices.Price highestListPrice;

    private gen.com.amazon.webservices.Price lowestSalePrice;

    private gen.com.amazon.webservices.Price highestSalePrice;

    public CollectionsCollectionCollectionSummary() {
    }

    public CollectionsCollectionCollectionSummary(
           gen.com.amazon.webservices.Price lowestListPrice,
           gen.com.amazon.webservices.Price highestListPrice,
           gen.com.amazon.webservices.Price lowestSalePrice,
           gen.com.amazon.webservices.Price highestSalePrice) {
           this.lowestListPrice = lowestListPrice;
           this.highestListPrice = highestListPrice;
           this.lowestSalePrice = lowestSalePrice;
           this.highestSalePrice = highestSalePrice;
    }


    /**
     * Gets the lowestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return lowestListPrice
     */
    public gen.com.amazon.webservices.Price getLowestListPrice() {
        return lowestListPrice;
    }


    /**
     * Sets the lowestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param lowestListPrice
     */
    public void setLowestListPrice(gen.com.amazon.webservices.Price lowestListPrice) {
        this.lowestListPrice = lowestListPrice;
    }


    /**
     * Gets the highestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return highestListPrice
     */
    public gen.com.amazon.webservices.Price getHighestListPrice() {
        return highestListPrice;
    }


    /**
     * Sets the highestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param highestListPrice
     */
    public void setHighestListPrice(gen.com.amazon.webservices.Price highestListPrice) {
        this.highestListPrice = highestListPrice;
    }


    /**
     * Gets the lowestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return lowestSalePrice
     */
    public gen.com.amazon.webservices.Price getLowestSalePrice() {
        return lowestSalePrice;
    }


    /**
     * Sets the lowestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param lowestSalePrice
     */
    public void setLowestSalePrice(gen.com.amazon.webservices.Price lowestSalePrice) {
        this.lowestSalePrice = lowestSalePrice;
    }


    /**
     * Gets the highestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return highestSalePrice
     */
    public gen.com.amazon.webservices.Price getHighestSalePrice() {
        return highestSalePrice;
    }


    /**
     * Sets the highestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param highestSalePrice
     */
    public void setHighestSalePrice(gen.com.amazon.webservices.Price highestSalePrice) {
        this.highestSalePrice = highestSalePrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionsCollectionCollectionSummary)) return false;
        CollectionsCollectionCollectionSummary other = (CollectionsCollectionCollectionSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lowestListPrice==null && other.getLowestListPrice()==null) || 
             (this.lowestListPrice!=null &&
              this.lowestListPrice.equals(other.getLowestListPrice()))) &&
            ((this.highestListPrice==null && other.getHighestListPrice()==null) || 
             (this.highestListPrice!=null &&
              this.highestListPrice.equals(other.getHighestListPrice()))) &&
            ((this.lowestSalePrice==null && other.getLowestSalePrice()==null) || 
             (this.lowestSalePrice!=null &&
              this.lowestSalePrice.equals(other.getLowestSalePrice()))) &&
            ((this.highestSalePrice==null && other.getHighestSalePrice()==null) || 
             (this.highestSalePrice!=null &&
              this.highestSalePrice.equals(other.getHighestSalePrice())));
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
        if (getLowestListPrice() != null) {
            _hashCode += getLowestListPrice().hashCode();
        }
        if (getHighestListPrice() != null) {
            _hashCode += getHighestListPrice().hashCode();
        }
        if (getLowestSalePrice() != null) {
            _hashCode += getLowestSalePrice().hashCode();
        }
        if (getHighestSalePrice() != null) {
            _hashCode += getHighestSalePrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollectionsCollectionCollectionSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LowestListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HighestListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestSalePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LowestSalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSalePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HighestSalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
