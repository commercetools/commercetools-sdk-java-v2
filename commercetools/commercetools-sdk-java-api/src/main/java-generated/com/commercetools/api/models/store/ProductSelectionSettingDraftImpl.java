package com.commercetools.api.models.store;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
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
 * ProductSelectionSettingDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionSettingDraftImpl implements ProductSelectionSettingDraft, ModelBase {

    
    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;
    
    
    private Boolean active;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionSettingDraftImpl(@JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection, @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
    }
    /**
     * create empty instance
     */
    public ProductSelectionSettingDraftImpl() {
    }

    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection(){
        return this.productSelection;
    }
    
    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     */
    
    public Boolean getActive(){
        return this.active;
    }

    
    public void setProductSelection(final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection){
        this.productSelection = productSelection;
    }
    
    
    public void setActive(final Boolean active){
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionSettingDraftImpl that = (ProductSelectionSettingDraftImpl) o;
    
        return new EqualsBuilder()
                .append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(productSelection)
            .append(active)
            .toHashCode();
    }

}
