package com.commercetools.importer.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The type of the import resource.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ImportResourceType {

    /**
    	<p>The category import resource type.</p>
    	
    */
    @JsonProperty("category")
    CATEGORY("category"),
    
    /**
    	<p>The order import resource type.</p>
    	
    */
    @JsonProperty("order")
    ORDER("order"),
    
    /**
    	<p>The price import resource type.</p>
    	
    */
    @JsonProperty("price")
    PRICE("price"),
    
    /**
    	<p>The product import resource type.</p>
    	
    */
    @JsonProperty("product")
    PRODUCT("product"),
    
    
    @JsonProperty("product-draft")
    PRODUCT_DRAFT("product-draft"),
    
    /**
    	<p>The product type import resource type.</p>
    	
    */
    @JsonProperty("product-type")
    PRODUCT_TYPE("product-type"),
    
    /**
    	<p>The product variant import resource type.</p>
    	
    */
    @JsonProperty("product-variant")
    PRODUCT_VARIANT("product-variant"),
    
    /**
    	<p>The product variant patch import resource type.</p>
    	
    */
    @JsonProperty("product-variant-patch")
    PRODUCT_VARIANT_PATCH("product-variant-patch"),
    
    /**
    	<p>The customer import resource type.</p>
    	
    */
    @JsonProperty("customer")
    CUSTOMER("customer");

    private final String jsonName;

    private ImportResourceType(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<ImportResourceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
