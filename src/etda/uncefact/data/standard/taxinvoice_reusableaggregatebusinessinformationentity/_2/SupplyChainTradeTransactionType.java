//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.taxinvoice_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005936&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;_ Supply Chain_ Trade Transaction. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The trade line items, trade agreement, trade delivery and trade settlement details included in this Cross Industry Invoice Header ().&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Transaction&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Supply Chain&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Invoicing&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:ns4="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SupplyChainTradeTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyChainTradeTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableHeaderTradeAgreement" type="{urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2}HeaderTradeAgreementType"/>
 *         &lt;element name="ApplicableHeaderTradeDelivery" type="{urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2}HeaderTradeDeliveryType"/>
 *         &lt;element name="ApplicableHeaderTradeSettlement" type="{urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2}HeaderTradeSettlementType"/>
 *         &lt;element name="IncludedSupplyChainTradeLineItem" type="{urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2}SupplyChainTradeLineItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyChainTradeTransactionType", propOrder = {
    "applicableHeaderTradeAgreement",
    "applicableHeaderTradeDelivery",
    "applicableHeaderTradeSettlement",
    "includedSupplyChainTradeLineItem"
})
public class SupplyChainTradeTransactionType {

    @XmlElement(name = "ApplicableHeaderTradeAgreement", required = true)
    protected HeaderTradeAgreementType applicableHeaderTradeAgreement;
    @XmlElement(name = "ApplicableHeaderTradeDelivery", required = true)
    protected HeaderTradeDeliveryType applicableHeaderTradeDelivery;
    @XmlElement(name = "ApplicableHeaderTradeSettlement", required = true)
    protected HeaderTradeSettlementType applicableHeaderTradeSettlement;
    @XmlElement(name = "IncludedSupplyChainTradeLineItem", required = true)
    protected List<SupplyChainTradeLineItemType> includedSupplyChainTradeLineItem;

    /**
     * Gets the value of the applicableHeaderTradeAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderTradeAgreementType }
     *     
     */
    public HeaderTradeAgreementType getApplicableHeaderTradeAgreement() {
        return applicableHeaderTradeAgreement;
    }

    /**
     * Sets the value of the applicableHeaderTradeAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderTradeAgreementType }
     *     
     */
    public void setApplicableHeaderTradeAgreement(HeaderTradeAgreementType value) {
        this.applicableHeaderTradeAgreement = value;
    }

    /**
     * Gets the value of the applicableHeaderTradeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderTradeDeliveryType }
     *     
     */
    public HeaderTradeDeliveryType getApplicableHeaderTradeDelivery() {
        return applicableHeaderTradeDelivery;
    }

    /**
     * Sets the value of the applicableHeaderTradeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderTradeDeliveryType }
     *     
     */
    public void setApplicableHeaderTradeDelivery(HeaderTradeDeliveryType value) {
        this.applicableHeaderTradeDelivery = value;
    }

    /**
     * Gets the value of the applicableHeaderTradeSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderTradeSettlementType }
     *     
     */
    public HeaderTradeSettlementType getApplicableHeaderTradeSettlement() {
        return applicableHeaderTradeSettlement;
    }

    /**
     * Sets the value of the applicableHeaderTradeSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderTradeSettlementType }
     *     
     */
    public void setApplicableHeaderTradeSettlement(HeaderTradeSettlementType value) {
        this.applicableHeaderTradeSettlement = value;
    }

    /**
     * Gets the value of the includedSupplyChainTradeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSupplyChainTradeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSupplyChainTradeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyChainTradeLineItemType }
     * 
     * 
     */
    public List<SupplyChainTradeLineItemType> getIncludedSupplyChainTradeLineItem() {
        if (includedSupplyChainTradeLineItem == null) {
            includedSupplyChainTradeLineItem = new ArrayList<SupplyChainTradeLineItemType>();
        }
        return this.includedSupplyChainTradeLineItem;
    }

}
