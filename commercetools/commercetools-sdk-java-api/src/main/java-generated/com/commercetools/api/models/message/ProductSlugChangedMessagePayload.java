package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSlugChangedMessagePayloadImpl.class)
public interface ProductSlugChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static ProductSlugChangedMessagePayload of(){
        return new ProductSlugChangedMessagePayloadImpl();
    }
    

    public static ProductSlugChangedMessagePayload of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadImpl instance = new ProductSlugChangedMessagePayloadImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static ProductSlugChangedMessagePayloadBuilder builder(){
        return ProductSlugChangedMessagePayloadBuilder.of();
    }
    
    public static ProductSlugChangedMessagePayloadBuilder builder(final ProductSlugChangedMessagePayload template){
        return ProductSlugChangedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withProductSlugChangedMessagePayload(Function<ProductSlugChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
