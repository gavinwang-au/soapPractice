/**
 * ItemAttributesPackageDimensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gen.com.amazon.webservices;

public class ItemAttributesPackageDimensions  implements java.io.Serializable {
    private gen.com.amazon.webservices.DecimalWithUnits height;

    private gen.com.amazon.webservices.DecimalWithUnits length;

    private gen.com.amazon.webservices.DecimalWithUnits weight;

    private gen.com.amazon.webservices.DecimalWithUnits width;

    public ItemAttributesPackageDimensions() {
    }

    public ItemAttributesPackageDimensions(
           gen.com.amazon.webservices.DecimalWithUnits height,
           gen.com.amazon.webservices.DecimalWithUnits length,
           gen.com.amazon.webservices.DecimalWithUnits weight,
           gen.com.amazon.webservices.DecimalWithUnits width) {
           this.height = height;
           this.length = length;
           this.weight = weight;
           this.width = width;
    }


    /**
     * Gets the height value for this ItemAttributesPackageDimensions.
     * 
     * @return height
     */
    public gen.com.amazon.webservices.DecimalWithUnits getHeight() {
        return height;
    }


    /**
     * Sets the height value for this ItemAttributesPackageDimensions.
     * 
     * @param height
     */
    public void setHeight(gen.com.amazon.webservices.DecimalWithUnits height) {
        this.height = height;
    }


    /**
     * Gets the length value for this ItemAttributesPackageDimensions.
     * 
     * @return length
     */
    public gen.com.amazon.webservices.DecimalWithUnits getLength() {
        return length;
    }


    /**
     * Sets the length value for this ItemAttributesPackageDimensions.
     * 
     * @param length
     */
    public void setLength(gen.com.amazon.webservices.DecimalWithUnits length) {
        this.length = length;
    }


    /**
     * Gets the weight value for this ItemAttributesPackageDimensions.
     * 
     * @return weight
     */
    public gen.com.amazon.webservices.DecimalWithUnits getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemAttributesPackageDimensions.
     * 
     * @param weight
     */
    public void setWeight(gen.com.amazon.webservices.DecimalWithUnits weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this ItemAttributesPackageDimensions.
     * 
     * @return width
     */
    public gen.com.amazon.webservices.DecimalWithUnits getWidth() {
        return width;
    }


    /**
     * Sets the width value for this ItemAttributesPackageDimensions.
     * 
     * @param width
     */
    public void setWidth(gen.com.amazon.webservices.DecimalWithUnits width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAttributesPackageDimensions)) return false;
        ItemAttributesPackageDimensions other = (ItemAttributesPackageDimensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAttributesPackageDimensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>PackageDimensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
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
