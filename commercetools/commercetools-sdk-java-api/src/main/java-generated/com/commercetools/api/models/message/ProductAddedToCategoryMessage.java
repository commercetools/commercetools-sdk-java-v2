package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductAddedToCategoryMessageImpl.class)
public interface ProductAddedToCategoryMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);
    
    public void setStaged(final Boolean staged);

    public static ProductAddedToCategoryMessageImpl of(){
        return new ProductAddedToCategoryMessageImpl();
    }
    

    public static ProductAddedToCategoryMessageImpl of(final ProductAddedToCategoryMessage template) {
        ProductAddedToCategoryMessageImpl instance = new ProductAddedToCategoryMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductAddedToCategoryMessage(Function<ProductAddedToCategoryMessage, T> helper) {
        return helper.apply(this);
    }
}
