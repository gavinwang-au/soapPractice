/**
 * Items.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gen.com.amazon.webservices;

public class Items  implements java.io.Serializable {
    private gen.com.amazon.webservices.Request request;

    private gen.com.amazon.webservices.CorrectedQuery correctedQuery;

    private java.lang.String qid;

    private java.lang.String engineQuery;

    private org.apache.axis.types.NonNegativeInteger totalResults;

    private org.apache.axis.types.NonNegativeInteger totalPages;

    private java.lang.String moreSearchResultsUrl;

    private gen.com.amazon.webservices.SearchResultsMapSearchIndex[] searchResultsMap;

    private gen.com.amazon.webservices.Item[] item;

    private gen.com.amazon.webservices.Bin[][] searchBinSets;

    public Items() {
    }

    public Items(
           gen.com.amazon.webservices.Request request,
           gen.com.amazon.webservices.CorrectedQuery correctedQuery,
           java.lang.String qid,
           java.lang.String engineQuery,
           org.apache.axis.types.NonNegativeInteger totalResults,
           org.apache.axis.types.NonNegativeInteger totalPages,
           java.lang.String moreSearchResultsUrl,
           gen.com.amazon.webservices.SearchResultsMapSearchIndex[] searchResultsMap,
           gen.com.amazon.webservices.Item[] item,
           gen.com.amazon.webservices.Bin[][] searchBinSets) {
           this.request = request;
           this.correctedQuery = correctedQuery;
           this.qid = qid;
           this.engineQuery = engineQuery;
           this.totalResults = totalResults;
           this.totalPages = totalPages;
           this.moreSearchResultsUrl = moreSearchResultsUrl;
           this.searchResultsMap = searchResultsMap;
           this.item = item;
           this.searchBinSets = searchBinSets;
    }


    /**
     * Gets the request value for this Items.
     * 
     * @return request
     */
    public gen.com.amazon.webservices.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Items.
     * 
     * @param request
     */
    public void setRequest(gen.com.amazon.webservices.Request request) {
        this.request = request;
    }


    /**
     * Gets the correctedQuery value for this Items.
     * 
     * @return correctedQuery
     */
    public gen.com.amazon.webservices.CorrectedQuery getCorrectedQuery() {
        return correctedQuery;
    }


    /**
     * Sets the correctedQuery value for this Items.
     * 
     * @param correctedQuery
     */
    public void setCorrectedQuery(gen.com.amazon.webservices.CorrectedQuery correctedQuery) {
        this.correctedQuery = correctedQuery;
    }


    /**
     * Gets the qid value for this Items.
     * 
     * @return qid
     */
    public java.lang.String getQid() {
        return qid;
    }


    /**
     * Sets the qid value for this Items.
     * 
     * @param qid
     */
    public void setQid(java.lang.String qid) {
        this.qid = qid;
    }


    /**
     * Gets the engineQuery value for this Items.
     * 
     * @return engineQuery
     */
    public java.lang.String getEngineQuery() {
        return engineQuery;
    }


    /**
     * Sets the engineQuery value for this Items.
     * 
     * @param engineQuery
     */
    public void setEngineQuery(java.lang.String engineQuery) {
        this.engineQuery = engineQuery;
    }


    /**
     * Gets the totalResults value for this Items.
     * 
     * @return totalResults
     */
    public org.apache.axis.types.NonNegativeInteger getTotalResults() {
        return totalResults;
    }


    /**
     * Sets the totalResults value for this Items.
     * 
     * @param totalResults
     */
    public void setTotalResults(org.apache.axis.types.NonNegativeInteger totalResults) {
        this.totalResults = totalResults;
    }


    /**
     * Gets the totalPages value for this Items.
     * 
     * @return totalPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this Items.
     * 
     * @param totalPages
     */
    public void setTotalPages(org.apache.axis.types.NonNegativeInteger totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the moreSearchResultsUrl value for this Items.
     * 
     * @return moreSearchResultsUrl
     */
    public java.lang.String getMoreSearchResultsUrl() {
        return moreSearchResultsUrl;
    }


    /**
     * Sets the moreSearchResultsUrl value for this Items.
     * 
     * @param moreSearchResultsUrl
     */
    public void setMoreSearchResultsUrl(java.lang.String moreSearchResultsUrl) {
        this.moreSearchResultsUrl = moreSearchResultsUrl;
    }


    /**
     * Gets the searchResultsMap value for this Items.
     * 
     * @return searchResultsMap
     */
    public gen.com.amazon.webservices.SearchResultsMapSearchIndex[] getSearchResultsMap() {
        return searchResultsMap;
    }


    /**
     * Sets the searchResultsMap value for this Items.
     * 
     * @param searchResultsMap
     */
    public void setSearchResultsMap(gen.com.amazon.webservices.SearchResultsMapSearchIndex[] searchResultsMap) {
        this.searchResultsMap = searchResultsMap;
    }


    /**
     * Gets the item value for this Items.
     * 
     * @return item
     */
    public gen.com.amazon.webservices.Item[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this Items.
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


    /**
     * Gets the searchBinSets value for this Items.
     * 
     * @return searchBinSets
     */
    public gen.com.amazon.webservices.Bin[][] getSearchBinSets() {
        return searchBinSets;
    }


    /**
     * Sets the searchBinSets value for this Items.
     * 
     * @param searchBinSets
     */
    public void setSearchBinSets(gen.com.amazon.webservices.Bin[][] searchBinSets) {
        this.searchBinSets = searchBinSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Items)) return false;
        Items other = (Items) obj;
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
            ((this.correctedQuery==null && other.getCorrectedQuery()==null) || 
             (this.correctedQuery!=null &&
              this.correctedQuery.equals(other.getCorrectedQuery()))) &&
            ((this.qid==null && other.getQid()==null) || 
             (this.qid!=null &&
              this.qid.equals(other.getQid()))) &&
            ((this.engineQuery==null && other.getEngineQuery()==null) || 
             (this.engineQuery!=null &&
              this.engineQuery.equals(other.getEngineQuery()))) &&
            ((this.totalResults==null && other.getTotalResults()==null) || 
             (this.totalResults!=null &&
              this.totalResults.equals(other.getTotalResults()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.moreSearchResultsUrl==null && other.getMoreSearchResultsUrl()==null) || 
             (this.moreSearchResultsUrl!=null &&
              this.moreSearchResultsUrl.equals(other.getMoreSearchResultsUrl()))) &&
            ((this.searchResultsMap==null && other.getSearchResultsMap()==null) || 
             (this.searchResultsMap!=null &&
              java.util.Arrays.equals(this.searchResultsMap, other.getSearchResultsMap()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.searchBinSets==null && other.getSearchBinSets()==null) || 
             (this.searchBinSets!=null &&
              java.util.Arrays.equals(this.searchBinSets, other.getSearchBinSets())));
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
        if (getCorrectedQuery() != null) {
            _hashCode += getCorrectedQuery().hashCode();
        }
        if (getQid() != null) {
            _hashCode += getQid().hashCode();
        }
        if (getEngineQuery() != null) {
            _hashCode += getEngineQuery().hashCode();
        }
        if (getTotalResults() != null) {
            _hashCode += getTotalResults().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getMoreSearchResultsUrl() != null) {
            _hashCode += getMoreSearchResultsUrl().hashCode();
        }
        if (getSearchResultsMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchResultsMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchResultsMap(), i);
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
        if (getSearchBinSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchBinSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchBinSets(), i);
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
        new org.apache.axis.description.TypeDesc(Items.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Items"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CorrectedQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CorrectedQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Qid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EngineQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TotalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreSearchResultsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MoreSearchResultsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResultsMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SearchResultsMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SearchResultsMap"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchBinSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SearchBinSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SearchBinSets"));
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
