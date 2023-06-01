package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product_selection.ProductSelection;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Create Product Selection request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionCreatedMessagePayloadImpl implements ProductSelectionCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product_selection.ProductSelection productSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionCreatedMessagePayloadImpl(@JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelection productSelection) {
        this.productSelection = productSelection;
        this.type =  PRODUCT_SELECTION_CREATED;
    }
    /**
     * create empty instance
     */
    public ProductSelectionCreatedMessagePayloadImpl() {
        this.type =  PRODUCT_SELECTION_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Product Selection that was created.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductSelection getProductSelection(){
        return this.productSelection;
    }

    
    public void setProductSelection(final com.commercetools.api.models.product_selection.ProductSelection productSelection){
        this.productSelection = productSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionCreatedMessagePayloadImpl that = (ProductSelectionCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(productSelection, that.productSelection)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(productSelection)
            .toHashCode();
    }

}
