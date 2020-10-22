package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.TextLineItemImpl;

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
@JsonDeserialize(as = TextLineItemImpl.class)
public interface TextLineItem  {

    /**
    *  <p>When the text line item was added to the shopping list.</p>
    */
    @NotNull
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();
    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    /**
    *  <p>The unique ID of this TextLineItem.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    public void setAddedAt(final ZonedDateTime addedAt);
    
    public void setCustom(final CustomFields custom);
    
    public void setDescription(final LocalizedString description);
    
    public void setId(final String id);
    
    public void setName(final LocalizedString name);
    
    public void setQuantity(final Integer quantity);

    public static TextLineItemImpl of(){
        return new TextLineItemImpl();
    }
    

    public static TextLineItemImpl of(final TextLineItem template) {
        TextLineItemImpl instance = new TextLineItemImpl();
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        instance.setDescription(template.getDescription());
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    default <T extends Accessor<TextLineItem>> T withTextLineItem(Function<TextLineItem, T> helper) {
        return helper.apply(this);
    }
}
