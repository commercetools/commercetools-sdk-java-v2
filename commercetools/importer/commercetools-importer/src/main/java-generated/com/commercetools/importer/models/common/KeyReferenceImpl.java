package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.CartDiscountKeyReference;
import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.CustomerKeyReference;
import com.commercetools.importer.models.common.PriceKeyReference;
import com.commercetools.importer.models.common.ProductDiscountKeyReference;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.common.ProductVariantKeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.ShippingMethodKeyReference;
import com.commercetools.importer.models.common.StateKeyReference;
import com.commercetools.importer.models.common.StoreKeyReference;
import com.commercetools.importer.models.common.TaxCategoryKeyReference;
import com.commercetools.importer.models.common.TypeKeyReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>References a resource by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class KeyReferenceImpl implements KeyReference {

    private String key;
    
    private com.commercetools.importer.models.common.ReferenceType typeId;

    @JsonCreator
    KeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceType.findEnumViaJsonName("null").get();
    }
    public KeyReferenceImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The type of the referenced resource.</p>
    */
    public com.commercetools.importer.models.common.ReferenceType getTypeId(){
        return this.typeId;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
