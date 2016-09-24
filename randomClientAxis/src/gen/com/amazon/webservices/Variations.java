/**
 * Variations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gen.com.amazon.webservices;

public class Variations  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger totalVariations;

    private org.apache.axis.types.NonNegativeInteger totalVariationPages;

    private java.lang.String[] variationDimensions;

    private gen.com.amazon.webservices.Item[] item;

    public Variations() {
    }

    public Variations(
           org.apache.axis.types.NonNegativeInteger totalVariations,
           org.apache.axis.types.NonNegativeInteger totalVariationPages,
           java.lang.String[] variationDimensions,
           gen.com.amazon.webservices.Item[] item) {
           this.totalVariations = totalVariations;
           this.totalVariationPages = totalVariationPages;
           this.variationDimensions = variationDimensions;
           this.item = item;
    }


    /**
     * Gets the totalVariations value for this Variations.
     * 
     * @return totalVariations
     */
    public org.apache.axis.types.NonNegativeInteger getTotalVariations() {
        return totalVariations;
    }


    /**
     * Sets the totalVariations value for this Variations.
     * 
     * @param totalVariations
     */
    public void setTotalVariations(org.apache.axis.types.NonNegativeInteger totalVariations) {
        this.totalVariations = totalVariations;
    }


    /**
     * Gets the totalVariationPages value for this Variations.
     * 
     * @return totalVariationPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalVariationPages() {
        return totalVariationPages;
    }


    /**
     * Sets the totalVariationPages value for this Variations.
     * 
     * @param totalVariationPages
     */
    public void setTotalVariationPages(org.apache.axis.types.NonNegativeInteger totalVariationPages) {
        this.totalVariationPages = totalVariationPages;
    }


    /**
     * Gets the variationDimensions value for this Variations.
     * 
     * @return variationDimensions
     */
    public java.lang.String[] getVariationDimensions() {
        return variationDimensions;
    }


    /**
     * Sets the variationDimensions value for this Variations.
     * 
     * @param variationDimensions
     */
    public void setVariationDimensions(java.lang.String[] variationDimensions) {
        this.variationDimensions = variationDimensions;
    }


    /**
     * Gets the item value for this Variations.
     * 
     * @return item
     */
    public gen.com.amazon.webservices.Item[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this Variations.
     * 
     * @param item
     */
    public void setItem(gen.com.amazon.webservices.Item[] item) {
        this.item = item;
    }

    public gen.com.amazon.webservices.Item getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, gen.com.amazon.webservices.Item _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Variations)) return false;
        Variations other = (Variations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalVariations==null && other.getTotalVariations()==null) || 
             (this.totalVariations!=null &&
              this.totalVariations.equals(other.getTotalVariations()))) &&
            ((this.totalVariationPages==null && other.getTotalVariationPages()==null) || 
             (this.totalVariationPages!=null &&
              this.totalVariationPages.equals(other.getTotalVariationPages()))) &&
            ((this.variationDimensions==null && other.getVariationDimensions()==null) || 
             (this.variationDimensions!=null &&
              java.util.Arrays.equals(this.variationDimensions, other.getVariationDimensions()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        if (getTotalVariations() != null) {
            _hashCode += getTotalVariations().hashCode();
        }
        if (getTotalVariationPages() != null) {
            _hashCode += getTotalVariationPages().hashCode();
        }
        if (getVariationDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariationDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariationDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
        new org.apache.axis.description.TypeDesc(Variations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Variations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVariations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalVariations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVariationPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalVariationPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">VariationDimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Item"));
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