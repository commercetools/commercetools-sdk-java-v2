package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionType;
import com.commercetools.api.models.product_selection.IndividualProductSelectionType;
import com.commercetools.api.models.product_selection.ProductSelectionTypeEnum;
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
 * ProductSelectionType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@Deprecated
public class ProductSelectionTypeImpl implements ProductSelectionType, ModelBase {

    @Deprecated
    private com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionTypeImpl(@JsonProperty("type") final com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ProductSelectionTypeImpl() {
    }

    /**
     *  <p>The following types of Product Selections are supported:</p>
     */
    @Deprecated
    public com.commercetools.api.models.product_selection.ProductSelectionTypeEnum getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionTypeImpl that = (ProductSelectionTypeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
