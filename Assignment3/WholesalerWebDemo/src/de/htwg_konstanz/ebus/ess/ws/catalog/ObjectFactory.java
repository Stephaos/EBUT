
package de.htwg_konstanz.ebus.ess.ws.catalog;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.htwg_konstanz.ebus.ess.ws.catalog package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KEYWORD_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "KEYWORD");
    private final static QName _TAX_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "TAX");
    private final static QName _PRICECURRENCY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PRICE_CURRENCY");
    private final static QName _MANUFACTURERNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MANUFACTURER_NAME");
    private final static QName _EMAIL_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "EMAIL");
    private final static QName _REFERENCEFEATUREGROUPID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "REFERENCE_FEATURE_GROUP_ID");
    private final static QName _CONTACT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CONTACT");
    private final static QName _FVALUE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FVALUE");
    private final static QName _FTIDREF_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_IDREF");
    private final static QName _MIMEORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_ORDER");
    private final static QName _UNITDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "UNIT_DESCR");
    private final static QName _CLASSIFICATIONGROUPPARENTID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_GROUP_PARENT_ID");
    private final static QName _ALLOWEDVALUEDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ALLOWED_VALUE_DESCR");
    private final static QName _COUNTRY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "COUNTRY");
    private final static QName _MIMEPURPOSE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_PURPOSE");
    private final static QName _DESCRIPTIONLONG_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "DESCRIPTION_LONG");
    private final static QName _PARENTID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PARENT_ID");
    private final static QName _NAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "NAME");
    private final static QName _CLASSIFICATIONSYSTEMLEVELS_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_SYSTEM_LEVELS");
    private final static QName _CLASSIFICATIONSYSTEMVERSION_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_SYSTEM_VERSION");
    private final static QName _SUPPLIERAIDSUPPLEMENT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SUPPLIER_AID_SUPPLEMENT");
    private final static QName _LOWERBOUND_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "LOWER_BOUND");
    private final static QName _MANUFACTURERTYPEDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MANUFACTURER_TYPE_DESCR");
    private final static QName _DATE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "DATE");
    private final static QName _ZIPBOX_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ZIPBOX");
    private final static QName _FUNIT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FUNIT");
    private final static QName _STATE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "STATE");
    private final static QName _CATALOGVERSION_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CATALOG_VERSION");
    private final static QName _PRICEFACTOR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PRICE_FACTOR");
    private final static QName _FTORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_ORDER");
    private final static QName _FEATURESYSTEMDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FEATURE_SYSTEM_DESCR");
    private final static QName _PHONE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PHONE");
    private final static QName _VORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "VORDER");
    private final static QName _GROUPSYSTEMDESCRIPTION_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_SYSTEM_DESCRIPTION");
    private final static QName _SUPPLIERNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SUPPLIER_NAME");
    private final static QName _CONTENTUNIT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CONTENT_UNIT");
    private final static QName _CLASSIFICATIONSYSTEMNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_SYSTEM_NAME");
    private final static QName _FEATUREGROUPID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FEATURE_GROUP_ID");
    private final static QName _FEATUREGROUPDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FEATURE_GROUP_DESCR");
    private final static QName _UNITNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "UNIT_NAME");
    private final static QName _PRICEQUANTITY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PRICE_QUANTITY");
    private final static QName _QUANTITYMIN_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "QUANTITY_MIN");
    private final static QName _TIME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "TIME");
    private final static QName _CURRENCY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CURRENCY");
    private final static QName _REFERENCEFEATUREGROUPNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "REFERENCE_FEATURE_GROUP_NAME");
    private final static QName _SUPPLIERAID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SUPPLIER_AID");
    private final static QName _ProductCatalogServiceFault_QNAME = new QName("http://www.htwg-konstanz.de/ebsf/ws/product_catalog", "ProductCatalogServiceFault");
    private final static QName _FTUNIT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_UNIT");
    private final static QName _CLASSIFICATIONSYSTEMFULLNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_SYSTEM_FULLNAME");
    private final static QName _ERPGROUPSUPPLIER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ERP_GROUP_SUPPLIER");
    private final static QName _BUYERNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "BUYER_NAME");
    private final static QName _FAX_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FAX");
    private final static QName _DESCRIPTIONSHORT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "DESCRIPTION_SHORT");
    private final static QName _FTNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_NAME");
    private final static QName _ADDRESSREMARKS_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ADDRESS_REMARKS");
    private final static QName _FDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FDESCR");
    private final static QName _REMARKS_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "REMARKS");
    private final static QName _DELIVERYTIME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "DELIVERY_TIME");
    private final static QName _ERPGROUPBUYER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ERP_GROUP_BUYER");
    private final static QName _REFERENCEFEATURESYSTEMNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "REFERENCE_FEATURE_SYSTEM_NAME");
    private final static QName _ZIP_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ZIP");
    private final static QName _ARTID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ART_ID");
    private final static QName _UNITID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "UNIT_ID");
    private final static QName _GENERATORINFO_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GENERATOR_INFO");
    private final static QName _FTMANDATORY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_MANDATORY");
    private final static QName _TERRITORY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "TERRITORY");
    private final static QName _GROUPSYSTEMNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_SYSTEM_NAME");
    private final static QName _FVALUEDETAILS_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FVALUE_DETAILS");
    private final static QName _MIMESOURCE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_SOURCE");
    private final static QName _DAILYPRICE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "DAILY_PRICE");
    private final static QName _ARTICLEORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ARTICLE_ORDER");
    private final static QName _FTDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_DESCR");
    private final static QName _GROUPORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_ORDER");
    private final static QName _FTID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_ID");
    private final static QName _FEATURESYSTEMNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FEATURE_SYSTEM_NAME");
    private final static QName _SYNONYM_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SYNONYM");
    private final static QName _FNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FNAME");
    private final static QName _GROUPID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_ID");
    private final static QName _LANGUAGE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "LANGUAGE");
    private final static QName _PRICEAMOUNT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "PRICE_AMOUNT");
    private final static QName _CLASSIFICATIONGROUPNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_GROUP_NAME");
    private final static QName _GROUPSYSTEMID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_SYSTEM_ID");
    private final static QName _MIMEROOT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_ROOT");
    private final static QName _CATALOGID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CATALOG_ID");
    private final static QName _AGREEMENTID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "AGREEMENT_ID");
    private final static QName _EAN_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "EAN");
    private final static QName _ORDERUNIT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ORDER_UNIT");
    private final static QName _MIMEDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_DESCR");
    private final static QName _ARTICLETOCATALOGGROUPMAPORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ARTICLE_TO_CATALOGGROUP_MAP_ORDER");
    private final static QName _MIMETYPE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_TYPE");
    private final static QName _URL_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "URL");
    private final static QName _MIMEALT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MIME_ALT");
    private final static QName _MANUFACTURERAID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "MANUFACTURER_AID");
    private final static QName _QUANTITYINTERVAL_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "QUANTITY_INTERVAL");
    private final static QName _CLASSIFICATIONGROUPID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_GROUP_ID");
    private final static QName _FEATUREGROUPNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FEATURE_GROUP_NAME");
    private final static QName _FORDER_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FORDER");
    private final static QName _NOCUPEROU_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "NO_CU_PER_OU");
    private final static QName _CLASSIFICATIONSYSTEMDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_SYSTEM_DESCR");
    private final static QName _CATALOGGROUPID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CATALOG_GROUP_ID");
    private final static QName _ALLOWEDVALUEID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ALLOWED_VALUE_ID");
    private final static QName _GROUPDESCRIPTION_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_DESCRIPTION");
    private final static QName _FTDATATYPE_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "FT_DATATYPE");
    private final static QName _BOXNO_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "BOXNO");
    private final static QName _STREET_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "STREET");
    private final static QName _ARTIDTO_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ART_ID_TO");
    private final static QName _NAME2_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "NAME2");
    private final static QName _SUPPLIERALTAID_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SUPPLIER_ALT_AID");
    private final static QName _NAME3_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "NAME3");
    private final static QName _SEGMENT_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "SEGMENT");
    private final static QName _CATALOGNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CATALOG_NAME");
    private final static QName _CLASSIFICATIONGROUPDESCR_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CLASSIFICATION_GROUP_DESCR");
    private final static QName _ALLOWEDVALUENAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "ALLOWED_VALUE_NAME");
    private final static QName _GROUPNAME_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "GROUP_NAME");
    private final static QName _CITY_QNAME = new QName("http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", "CITY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.htwg_konstanz.ebus.ess.ws.catalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CATALOG }
     * 
     */
    public CATALOG createCATALOG() {
        return new CATALOG();
    }

    /**
     * Create an instance of {@link SUPPLIER }
     * 
     */
    public SUPPLIER createSUPPLIER() {
        return new SUPPLIER();
    }

    /**
     * Create an instance of {@link BUYER }
     * 
     */
    public BUYER createBUYER() {
        return new BUYER();
    }

    /**
     * Create an instance of {@link AGREEMENT }
     * 
     */
    public AGREEMENT createAGREEMENT() {
        return new AGREEMENT();
    }

    /**
     * Create an instance of {@link ProductCatalogServiceResponse }
     * 
     */
    public ProductCatalogServiceResponse createProductCatalogServiceResponse() {
        return new ProductCatalogServiceResponse();
    }

    /**
     * Create an instance of {@link BMECAT }
     * 
     */
    public BMECAT createBMECAT() {
        return new BMECAT();
    }

    /**
     * Create an instance of {@link HEADER }
     * 
     */
    public HEADER createHEADER() {
        return new HEADER();
    }

    /**
     * Create an instance of {@link CATALOG.DATETIME }
     * 
     */
    public CATALOG.DATETIME createCATALOGDATETIME() {
        return new CATALOG.DATETIME();
    }

    /**
     * Create an instance of {@link SUPPLIERID }
     * 
     */
    public SUPPLIERID createSUPPLIERID() {
        return new SUPPLIERID();
    }

    /**
     * Create an instance of {@link SUPPLIER.ADDRESS }
     * 
     */
    public SUPPLIER.ADDRESS createSUPPLIERADDRESS() {
        return new SUPPLIER.ADDRESS();
    }

    /**
     * Create an instance of {@link TNEWCATALOG }
     * 
     */
    public TNEWCATALOG createTNEWCATALOG() {
        return new TNEWCATALOG();
    }

    /**
     * Create an instance of {@link ARTICLE }
     * 
     */
    public ARTICLE createARTICLE() {
        return new ARTICLE();
    }

    /**
     * Create an instance of {@link ARTICLEDETAILS }
     * 
     */
    public ARTICLEDETAILS createARTICLEDETAILS() {
        return new ARTICLEDETAILS();
    }

    /**
     * Create an instance of {@link BUYERAID }
     * 
     */
    public BUYERAID createBUYERAID() {
        return new BUYERAID();
    }

    /**
     * Create an instance of {@link ARTICLEORDERDETAILS }
     * 
     */
    public ARTICLEORDERDETAILS createARTICLEORDERDETAILS() {
        return new ARTICLEORDERDETAILS();
    }

    /**
     * Create an instance of {@link ARTICLEPRICEDETAILS }
     * 
     */
    public ARTICLEPRICEDETAILS createARTICLEPRICEDETAILS() {
        return new ARTICLEPRICEDETAILS();
    }

    /**
     * Create an instance of {@link ARTICLEPRICE }
     * 
     */
    public ARTICLEPRICE createARTICLEPRICE() {
        return new ARTICLEPRICE();
    }

    /**
     * Create an instance of {@link MIMEINFO }
     * 
     */
    public MIMEINFO createMIMEINFO() {
        return new MIMEINFO();
    }

    /**
     * Create an instance of {@link MIME }
     * 
     */
    public MIME createMIME() {
        return new MIME();
    }

    /**
     * Create an instance of {@link ARTICLEREFERENCE }
     * 
     */
    public ARTICLEREFERENCE createARTICLEREFERENCE() {
        return new ARTICLEREFERENCE();
    }

    /**
     * Create an instance of {@link ProductCatalogServiceRequest }
     * 
     */
    public ProductCatalogServiceRequest createProductCatalogServiceRequest() {
        return new ProductCatalogServiceRequest();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONSYSTEMFEATURETEMPLATE }
     * 
     */
    public CLASSIFICATIONSYSTEMFEATURETEMPLATE createCLASSIFICATIONSYSTEMFEATURETEMPLATE() {
        return new CLASSIFICATIONSYSTEMFEATURETEMPLATE();
    }

    /**
     * Create an instance of {@link ARTICLETOCATALOGGROUPMAP }
     * 
     */
    public ARTICLETOCATALOGGROUPMAP createARTICLETOCATALOGGROUPMAP() {
        return new ARTICLETOCATALOGGROUPMAP();
    }

    /**
     * Create an instance of {@link BUYERID }
     * 
     */
    public BUYERID createBUYERID() {
        return new BUYERID();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONSYSTEMLEVELNAME }
     * 
     */
    public CLASSIFICATIONSYSTEMLEVELNAME createCLASSIFICATIONSYSTEMLEVELNAME() {
        return new CLASSIFICATIONSYSTEMLEVELNAME();
    }

    /**
     * Create an instance of {@link ALLOWEDVALUES }
     * 
     */
    public ALLOWEDVALUES createALLOWEDVALUES() {
        return new ALLOWEDVALUES();
    }

    /**
     * Create an instance of {@link ALLOWEDVALUE }
     * 
     */
    public ALLOWEDVALUE createALLOWEDVALUE() {
        return new ALLOWEDVALUE();
    }

    /**
     * Create an instance of {@link ALLOWEDVALUEIDREF }
     * 
     */
    public ALLOWEDVALUEIDREF createALLOWEDVALUEIDREF() {
        return new ALLOWEDVALUEIDREF();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONGROUP }
     * 
     */
    public CLASSIFICATIONGROUP createCLASSIFICATIONGROUP() {
        return new CLASSIFICATIONGROUP();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONGROUPSYNONYMS }
     * 
     */
    public CLASSIFICATIONGROUPSYNONYMS createCLASSIFICATIONGROUPSYNONYMS() {
        return new CLASSIFICATIONGROUPSYNONYMS();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONGROUPFEATURETEMPLATES }
     * 
     */
    public CLASSIFICATIONGROUPFEATURETEMPLATES createCLASSIFICATIONGROUPFEATURETEMPLATES() {
        return new CLASSIFICATIONGROUPFEATURETEMPLATES();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONGROUPFEATURETEMPLATE }
     * 
     */
    public CLASSIFICATIONGROUPFEATURETEMPLATE createCLASSIFICATIONGROUPFEATURETEMPLATE() {
        return new CLASSIFICATIONGROUPFEATURETEMPLATE();
    }

    /**
     * Create an instance of {@link FTALLOWEDVALUES }
     * 
     */
    public FTALLOWEDVALUES createFTALLOWEDVALUES() {
        return new FTALLOWEDVALUES();
    }

    /**
     * Create an instance of {@link FEATUREGROUP }
     * 
     */
    public FEATUREGROUP createFEATUREGROUP() {
        return new FEATUREGROUP();
    }

    /**
     * Create an instance of {@link FEATURETEMPLATE }
     * 
     */
    public FEATURETEMPLATE createFEATURETEMPLATE() {
        return new FEATURETEMPLATE();
    }

    /**
     * Create an instance of {@link BUYER.ADDRESS }
     * 
     */
    public BUYER.ADDRESS createBUYERADDRESS() {
        return new BUYER.ADDRESS();
    }

    /**
     * Create an instance of {@link CATALOGSTRUCTURE }
     * 
     */
    public CATALOGSTRUCTURE createCATALOGSTRUCTURE() {
        return new CATALOGSTRUCTURE();
    }

    /**
     * Create an instance of {@link CatstrucUSERDEFINEDEXTENSIONS }
     * 
     */
    public CatstrucUSERDEFINEDEXTENSIONS createCatstrucUSERDEFINEDEXTENSIONS() {
        return new CatstrucUSERDEFINEDEXTENSIONS();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONSYSTEM }
     * 
     */
    public CLASSIFICATIONSYSTEM createCLASSIFICATIONSYSTEM() {
        return new CLASSIFICATIONSYSTEM();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONSYSTEMLEVELNAMES }
     * 
     */
    public CLASSIFICATIONSYSTEMLEVELNAMES createCLASSIFICATIONSYSTEMLEVELNAMES() {
        return new CLASSIFICATIONSYSTEMLEVELNAMES();
    }

    /**
     * Create an instance of {@link UNITS }
     * 
     */
    public UNITS createUNITS() {
        return new UNITS();
    }

    /**
     * Create an instance of {@link UNIT }
     * 
     */
    public UNIT createUNIT() {
        return new UNIT();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONSYSTEMFEATURETEMPLATES }
     * 
     */
    public CLASSIFICATIONSYSTEMFEATURETEMPLATES createCLASSIFICATIONSYSTEMFEATURETEMPLATES() {
        return new CLASSIFICATIONSYSTEMFEATURETEMPLATES();
    }

    /**
     * Create an instance of {@link CLASSIFICATIONGROUPS }
     * 
     */
    public CLASSIFICATIONGROUPS createCLASSIFICATIONGROUPS() {
        return new CLASSIFICATIONGROUPS();
    }

    /**
     * Create an instance of {@link FEATURESYSTEM }
     * 
     */
    public FEATURESYSTEM createFEATURESYSTEM() {
        return new FEATURESYSTEM();
    }

    /**
     * Create an instance of {@link VARIANT }
     * 
     */
    public VARIANT createVARIANT() {
        return new VARIANT();
    }

    /**
     * Create an instance of {@link VARIANTS }
     * 
     */
    public VARIANTS createVARIANTS() {
        return new VARIANTS();
    }

    /**
     * Create an instance of {@link AGREEMENT.DATETIME }
     * 
     */
    public AGREEMENT.DATETIME createAGREEMENTDATETIME() {
        return new AGREEMENT.DATETIME();
    }

    /**
     * Create an instance of {@link ARTICLESTATUS }
     * 
     */
    public ARTICLESTATUS createARTICLESTATUS() {
        return new ARTICLESTATUS();
    }

    /**
     * Create an instance of {@link PRICEFLAG }
     * 
     */
    public PRICEFLAG createPRICEFLAG() {
        return new PRICEFLAG();
    }

    /**
     * Create an instance of {@link FEATURE }
     * 
     */
    public FEATURE createFEATURE() {
        return new FEATURE();
    }

    /**
     * Create an instance of {@link CATALOGGROUPSYSTEM }
     * 
     */
    public CATALOGGROUPSYSTEM createCATALOGGROUPSYSTEM() {
        return new CATALOGGROUPSYSTEM();
    }

    /**
     * Create an instance of {@link SPECIALTREATMENTCLASS }
     * 
     */
    public SPECIALTREATMENTCLASS createSPECIALTREATMENTCLASS() {
        return new SPECIALTREATMENTCLASS();
    }

    /**
     * Create an instance of {@link ARTICLEFEATURES }
     * 
     */
    public ARTICLEFEATURES createARTICLEFEATURES() {
        return new ARTICLEFEATURES();
    }

    /**
     * Create an instance of {@link PUBLICKEY }
     * 
     */
    public PUBLICKEY createPUBLICKEY() {
        return new PUBLICKEY();
    }

    /**
     * Create an instance of {@link HeaderUSERDEFINEDEXTENSIONS }
     * 
     */
    public HeaderUSERDEFINEDEXTENSIONS createHeaderUSERDEFINEDEXTENSIONS() {
        return new HeaderUSERDEFINEDEXTENSIONS();
    }

    /**
     * Create an instance of {@link TypeADDRESS }
     * 
     */
    public TypeADDRESS createTypeADDRESS() {
        return new TypeADDRESS();
    }

    /**
     * Create an instance of {@link ArticleUSERDEFINEDEXTENSIONS }
     * 
     */
    public ArticleUSERDEFINEDEXTENSIONS createArticleUSERDEFINEDEXTENSIONS() {
        return new ArticleUSERDEFINEDEXTENSIONS();
    }

    /**
     * Create an instance of {@link TypeDATETIME }
     * 
     */
    public TypeDATETIME createTypeDATETIME() {
        return new TypeDATETIME();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "KEYWORD")
    public JAXBElement<String> createKEYWORD(String value) {
        return new JAXBElement<String>(_KEYWORD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "TAX")
    public JAXBElement<BigDecimal> createTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtCURRENCIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PRICE_CURRENCY")
    public JAXBElement<DtCURRENCIES> createPRICECURRENCY(DtCURRENCIES value) {
        return new JAXBElement<DtCURRENCIES>(_PRICECURRENCY_QNAME, DtCURRENCIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MANUFACTURER_NAME")
    public JAXBElement<String> createMANUFACTURERNAME(String value) {
        return new JAXBElement<String>(_MANUFACTURERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "EMAIL")
    public JAXBElement<String> createEMAIL(String value) {
        return new JAXBElement<String>(_EMAIL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "REFERENCE_FEATURE_GROUP_ID")
    public JAXBElement<String> createREFERENCEFEATUREGROUPID(String value) {
        return new JAXBElement<String>(_REFERENCEFEATUREGROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CONTACT")
    public JAXBElement<String> createCONTACT(String value) {
        return new JAXBElement<String>(_CONTACT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FVALUE")
    public JAXBElement<String> createFVALUE(String value) {
        return new JAXBElement<String>(_FVALUE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_IDREF")
    public JAXBElement<String> createFTIDREF(String value) {
        return new JAXBElement<String>(_FTIDREF_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_ORDER")
    public JAXBElement<BigInteger> createMIMEORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_MIMEORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "UNIT_DESCR")
    public JAXBElement<String> createUNITDESCR(String value) {
        return new JAXBElement<String>(_UNITDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_GROUP_PARENT_ID")
    public JAXBElement<String> createCLASSIFICATIONGROUPPARENTID(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONGROUPPARENTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ALLOWED_VALUE_DESCR")
    public JAXBElement<String> createALLOWEDVALUEDESCR(String value) {
        return new JAXBElement<String>(_ALLOWEDVALUEDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "COUNTRY")
    public JAXBElement<String> createCOUNTRY(String value) {
        return new JAXBElement<String>(_COUNTRY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_PURPOSE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMIMEPURPOSE(String value) {
        return new JAXBElement<String>(_MIMEPURPOSE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "DESCRIPTION_LONG")
    public JAXBElement<String> createDESCRIPTIONLONG(String value) {
        return new JAXBElement<String>(_DESCRIPTIONLONG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PARENT_ID")
    public JAXBElement<String> createPARENTID(String value) {
        return new JAXBElement<String>(_PARENTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "NAME")
    public JAXBElement<String> createNAME(String value) {
        return new JAXBElement<String>(_NAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_SYSTEM_LEVELS")
    public JAXBElement<BigInteger> createCLASSIFICATIONSYSTEMLEVELS(BigInteger value) {
        return new JAXBElement<BigInteger>(_CLASSIFICATIONSYSTEMLEVELS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_SYSTEM_VERSION")
    public JAXBElement<String> createCLASSIFICATIONSYSTEMVERSION(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONSYSTEMVERSION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SUPPLIER_AID_SUPPLEMENT")
    public JAXBElement<String> createSUPPLIERAIDSUPPLEMENT(String value) {
        return new JAXBElement<String>(_SUPPLIERAIDSUPPLEMENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "LOWER_BOUND")
    public JAXBElement<BigDecimal> createLOWERBOUND(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LOWERBOUND_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MANUFACTURER_TYPE_DESCR")
    public JAXBElement<String> createMANUFACTURERTYPEDESCR(String value) {
        return new JAXBElement<String>(_MANUFACTURERTYPEDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "DATE")
    public JAXBElement<XMLGregorianCalendar> createDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DATE_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ZIPBOX")
    public JAXBElement<String> createZIPBOX(String value) {
        return new JAXBElement<String>(_ZIPBOX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FUNIT")
    public JAXBElement<String> createFUNIT(String value) {
        return new JAXBElement<String>(_FUNIT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "STATE")
    public JAXBElement<String> createSTATE(String value) {
        return new JAXBElement<String>(_STATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CATALOG_VERSION")
    public JAXBElement<String> createCATALOGVERSION(String value) {
        return new JAXBElement<String>(_CATALOGVERSION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PRICE_FACTOR")
    public JAXBElement<BigDecimal> createPRICEFACTOR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEFACTOR_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_ORDER")
    public JAXBElement<BigInteger> createFTORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_FTORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FEATURE_SYSTEM_DESCR")
    public JAXBElement<String> createFEATURESYSTEMDESCR(String value) {
        return new JAXBElement<String>(_FEATURESYSTEMDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PHONE")
    public JAXBElement<String> createPHONE(String value) {
        return new JAXBElement<String>(_PHONE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "VORDER")
    public JAXBElement<BigInteger> createVORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_VORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_SYSTEM_DESCRIPTION")
    public JAXBElement<String> createGROUPSYSTEMDESCRIPTION(String value) {
        return new JAXBElement<String>(_GROUPSYSTEMDESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SUPPLIER_NAME")
    public JAXBElement<String> createSUPPLIERNAME(String value) {
        return new JAXBElement<String>(_SUPPLIERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CONTENT_UNIT")
    public JAXBElement<String> createCONTENTUNIT(String value) {
        return new JAXBElement<String>(_CONTENTUNIT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_SYSTEM_NAME")
    public JAXBElement<String> createCLASSIFICATIONSYSTEMNAME(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONSYSTEMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FEATURE_GROUP_ID")
    public JAXBElement<String> createFEATUREGROUPID(String value) {
        return new JAXBElement<String>(_FEATUREGROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FEATURE_GROUP_DESCR")
    public JAXBElement<String> createFEATUREGROUPDESCR(String value) {
        return new JAXBElement<String>(_FEATUREGROUPDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "UNIT_NAME")
    public JAXBElement<String> createUNITNAME(String value) {
        return new JAXBElement<String>(_UNITNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PRICE_QUANTITY")
    public JAXBElement<BigDecimal> createPRICEQUANTITY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEQUANTITY_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "QUANTITY_MIN")
    public JAXBElement<BigInteger> createQUANTITYMIN(BigInteger value) {
        return new JAXBElement<BigInteger>(_QUANTITYMIN_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "TIME")
    public JAXBElement<String> createTIME(String value) {
        return new JAXBElement<String>(_TIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtCURRENCIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CURRENCY")
    public JAXBElement<DtCURRENCIES> createCURRENCY(DtCURRENCIES value) {
        return new JAXBElement<DtCURRENCIES>(_CURRENCY_QNAME, DtCURRENCIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "REFERENCE_FEATURE_GROUP_NAME")
    public JAXBElement<String> createREFERENCEFEATUREGROUPNAME(String value) {
        return new JAXBElement<String>(_REFERENCEFEATUREGROUPNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SUPPLIER_AID")
    public JAXBElement<String> createSUPPLIERAID(String value) {
        return new JAXBElement<String>(_SUPPLIERAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.htwg-konstanz.de/ebsf/ws/product_catalog", name = "ProductCatalogServiceFault")
    public JAXBElement<String> createProductCatalogServiceFault(String value) {
        return new JAXBElement<String>(_ProductCatalogServiceFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_UNIT")
    public JAXBElement<String> createFTUNIT(String value) {
        return new JAXBElement<String>(_FTUNIT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_SYSTEM_FULLNAME")
    public JAXBElement<String> createCLASSIFICATIONSYSTEMFULLNAME(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONSYSTEMFULLNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ERP_GROUP_SUPPLIER")
    public JAXBElement<String> createERPGROUPSUPPLIER(String value) {
        return new JAXBElement<String>(_ERPGROUPSUPPLIER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "BUYER_NAME")
    public JAXBElement<String> createBUYERNAME(String value) {
        return new JAXBElement<String>(_BUYERNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FAX")
    public JAXBElement<String> createFAX(String value) {
        return new JAXBElement<String>(_FAX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "DESCRIPTION_SHORT")
    public JAXBElement<String> createDESCRIPTIONSHORT(String value) {
        return new JAXBElement<String>(_DESCRIPTIONSHORT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_NAME")
    public JAXBElement<String> createFTNAME(String value) {
        return new JAXBElement<String>(_FTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ADDRESS_REMARKS")
    public JAXBElement<String> createADDRESSREMARKS(String value) {
        return new JAXBElement<String>(_ADDRESSREMARKS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FDESCR")
    public JAXBElement<String> createFDESCR(String value) {
        return new JAXBElement<String>(_FDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "REMARKS")
    public JAXBElement<String> createREMARKS(String value) {
        return new JAXBElement<String>(_REMARKS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "DELIVERY_TIME")
    public JAXBElement<BigDecimal> createDELIVERYTIME(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DELIVERYTIME_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ERP_GROUP_BUYER")
    public JAXBElement<String> createERPGROUPBUYER(String value) {
        return new JAXBElement<String>(_ERPGROUPBUYER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "REFERENCE_FEATURE_SYSTEM_NAME")
    public JAXBElement<String> createREFERENCEFEATURESYSTEMNAME(String value) {
        return new JAXBElement<String>(_REFERENCEFEATURESYSTEMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ZIP")
    public JAXBElement<String> createZIP(String value) {
        return new JAXBElement<String>(_ZIP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ART_ID")
    public JAXBElement<String> createARTID(String value) {
        return new JAXBElement<String>(_ARTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "UNIT_ID")
    public JAXBElement<String> createUNITID(String value) {
        return new JAXBElement<String>(_UNITID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GENERATOR_INFO")
    public JAXBElement<String> createGENERATORINFO(String value) {
        return new JAXBElement<String>(_GENERATORINFO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_MANDATORY")
    public JAXBElement<String> createFTMANDATORY(String value) {
        return new JAXBElement<String>(_FTMANDATORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "TERRITORY")
    public JAXBElement<String> createTERRITORY(String value) {
        return new JAXBElement<String>(_TERRITORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_SYSTEM_NAME")
    public JAXBElement<String> createGROUPSYSTEMNAME(String value) {
        return new JAXBElement<String>(_GROUPSYSTEMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FVALUE_DETAILS")
    public JAXBElement<String> createFVALUEDETAILS(String value) {
        return new JAXBElement<String>(_FVALUEDETAILS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_SOURCE")
    public JAXBElement<String> createMIMESOURCE(String value) {
        return new JAXBElement<String>(_MIMESOURCE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "DAILY_PRICE")
    public JAXBElement<String> createDAILYPRICE(String value) {
        return new JAXBElement<String>(_DAILYPRICE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ARTICLE_ORDER")
    public JAXBElement<BigInteger> createARTICLEORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_ARTICLEORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_DESCR")
    public JAXBElement<String> createFTDESCR(String value) {
        return new JAXBElement<String>(_FTDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_ORDER")
    public JAXBElement<BigInteger> createGROUPORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_GROUPORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_ID")
    public JAXBElement<String> createFTID(String value) {
        return new JAXBElement<String>(_FTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FEATURE_SYSTEM_NAME")
    public JAXBElement<String> createFEATURESYSTEMNAME(String value) {
        return new JAXBElement<String>(_FEATURESYSTEMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SYNONYM")
    public JAXBElement<String> createSYNONYM(String value) {
        return new JAXBElement<String>(_SYNONYM_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FNAME")
    public JAXBElement<String> createFNAME(String value) {
        return new JAXBElement<String>(_FNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_ID")
    public JAXBElement<String> createGROUPID(String value) {
        return new JAXBElement<String>(_GROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "LANGUAGE")
    public JAXBElement<String> createLANGUAGE(String value) {
        return new JAXBElement<String>(_LANGUAGE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "PRICE_AMOUNT")
    public JAXBElement<BigDecimal> createPRICEAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_GROUP_NAME")
    public JAXBElement<String> createCLASSIFICATIONGROUPNAME(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONGROUPNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_SYSTEM_ID")
    public JAXBElement<String> createGROUPSYSTEMID(String value) {
        return new JAXBElement<String>(_GROUPSYSTEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_ROOT")
    public JAXBElement<String> createMIMEROOT(String value) {
        return new JAXBElement<String>(_MIMEROOT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CATALOG_ID")
    public JAXBElement<String> createCATALOGID(String value) {
        return new JAXBElement<String>(_CATALOGID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "AGREEMENT_ID")
    public JAXBElement<String> createAGREEMENTID(String value) {
        return new JAXBElement<String>(_AGREEMENTID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "EAN")
    public JAXBElement<String> createEAN(String value) {
        return new JAXBElement<String>(_EAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ORDER_UNIT")
    public JAXBElement<String> createORDERUNIT(String value) {
        return new JAXBElement<String>(_ORDERUNIT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_DESCR")
    public JAXBElement<String> createMIMEDESCR(String value) {
        return new JAXBElement<String>(_MIMEDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ARTICLE_TO_CATALOGGROUP_MAP_ORDER")
    public JAXBElement<BigInteger> createARTICLETOCATALOGGROUPMAPORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_ARTICLETOCATALOGGROUPMAPORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_TYPE")
    public JAXBElement<String> createMIMETYPE(String value) {
        return new JAXBElement<String>(_MIMETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MIME_ALT")
    public JAXBElement<String> createMIMEALT(String value) {
        return new JAXBElement<String>(_MIMEALT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "MANUFACTURER_AID")
    public JAXBElement<String> createMANUFACTURERAID(String value) {
        return new JAXBElement<String>(_MANUFACTURERAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "QUANTITY_INTERVAL")
    public JAXBElement<BigInteger> createQUANTITYINTERVAL(BigInteger value) {
        return new JAXBElement<BigInteger>(_QUANTITYINTERVAL_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_GROUP_ID")
    public JAXBElement<String> createCLASSIFICATIONGROUPID(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONGROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FEATURE_GROUP_NAME")
    public JAXBElement<String> createFEATUREGROUPNAME(String value) {
        return new JAXBElement<String>(_FEATUREGROUPNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FORDER")
    public JAXBElement<BigInteger> createFORDER(BigInteger value) {
        return new JAXBElement<BigInteger>(_FORDER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "NO_CU_PER_OU")
    public JAXBElement<BigDecimal> createNOCUPEROU(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NOCUPEROU_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_SYSTEM_DESCR")
    public JAXBElement<String> createCLASSIFICATIONSYSTEMDESCR(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONSYSTEMDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CATALOG_GROUP_ID")
    public JAXBElement<String> createCATALOGGROUPID(String value) {
        return new JAXBElement<String>(_CATALOGGROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ALLOWED_VALUE_ID")
    public JAXBElement<String> createALLOWEDVALUEID(String value) {
        return new JAXBElement<String>(_ALLOWEDVALUEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_DESCRIPTION")
    public JAXBElement<String> createGROUPDESCRIPTION(String value) {
        return new JAXBElement<String>(_GROUPDESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "FT_DATATYPE")
    public JAXBElement<String> createFTDATATYPE(String value) {
        return new JAXBElement<String>(_FTDATATYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "BOXNO")
    public JAXBElement<String> createBOXNO(String value) {
        return new JAXBElement<String>(_BOXNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "STREET")
    public JAXBElement<String> createSTREET(String value) {
        return new JAXBElement<String>(_STREET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ART_ID_TO")
    public JAXBElement<String> createARTIDTO(String value) {
        return new JAXBElement<String>(_ARTIDTO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "NAME2")
    public JAXBElement<String> createNAME2(String value) {
        return new JAXBElement<String>(_NAME2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SUPPLIER_ALT_AID")
    public JAXBElement<String> createSUPPLIERALTAID(String value) {
        return new JAXBElement<String>(_SUPPLIERALTAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "NAME3")
    public JAXBElement<String> createNAME3(String value) {
        return new JAXBElement<String>(_NAME3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "SEGMENT")
    public JAXBElement<String> createSEGMENT(String value) {
        return new JAXBElement<String>(_SEGMENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CATALOG_NAME")
    public JAXBElement<String> createCATALOGNAME(String value) {
        return new JAXBElement<String>(_CATALOGNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CLASSIFICATION_GROUP_DESCR")
    public JAXBElement<String> createCLASSIFICATIONGROUPDESCR(String value) {
        return new JAXBElement<String>(_CLASSIFICATIONGROUPDESCR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "ALLOWED_VALUE_NAME")
    public JAXBElement<String> createALLOWEDVALUENAME(String value) {
        return new JAXBElement<String>(_ALLOWEDVALUENAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "GROUP_NAME")
    public JAXBElement<String> createGROUPNAME(String value) {
        return new JAXBElement<String>(_GROUPNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog", name = "CITY")
    public JAXBElement<String> createCITY(String value) {
        return new JAXBElement<String>(_CITY_QNAME, String.class, null, value);
    }

}
