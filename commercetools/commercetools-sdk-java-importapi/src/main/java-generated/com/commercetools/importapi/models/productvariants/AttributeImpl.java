package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import com.commercetools.importapi.models.productvariants.BooleanSetAttribute;
import com.commercetools.importapi.models.productvariants.DateAttribute;
import com.commercetools.importapi.models.productvariants.DateSetAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeSetAttribute;
import com.commercetools.importapi.models.productvariants.EnumAttribute;
import com.commercetools.importapi.models.productvariants.EnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute;
import com.commercetools.importapi.models.productvariants.MoneyAttribute;
import com.commercetools.importapi.models.productvariants.MoneySetAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;
import com.commercetools.importapi.models.productvariants.NumberSetAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceSetAttribute;
import com.commercetools.importapi.models.productvariants.TextAttribute;
import com.commercetools.importapi.models.productvariants.TextSetAttribute;
import com.commercetools.importapi.models.productvariants.TimeAttribute;
import com.commercetools.importapi.models.productvariants.TimeSetAttribute;
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
*  <p>This type represents the value of an attribute of a product variant.
*  The name and type property must match the name and type property of an attribute definition of the product type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeImpl implements Attribute {

    private String name;
    
    private String type;

    @JsonCreator
    AttributeImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.type = "null";
    }
    public AttributeImpl() {
       
    }

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */
    public String getName(){
        return this.name;
    }
    
    
    public String getType(){
        return this.type;
    }

    public void setName(final String name){
        this.name = name;
    }

}
