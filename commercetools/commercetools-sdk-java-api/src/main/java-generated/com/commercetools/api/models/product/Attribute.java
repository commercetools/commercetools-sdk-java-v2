package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.AttributeImpl;

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
@JsonDeserialize(as = AttributeImpl.class)
public interface Attribute  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
    *  <p>A valid JSON value, based on an AttributeDefinition.</p>
    */
    @NotNull
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static AttributeImpl of(){
        return new AttributeImpl();
    }
    

    public static AttributeImpl of(final Attribute template) {
        AttributeImpl instance = new AttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<Attribute>> T withAttribute(Function<Attribute, T> helper) {
        return helper.apply(this);
    }
}
