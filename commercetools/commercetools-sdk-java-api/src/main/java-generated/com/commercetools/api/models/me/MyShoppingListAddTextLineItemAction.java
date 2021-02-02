
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListAddTextLineItemActionImpl.class)
public interface MyShoppingListAddTextLineItemAction extends MyShoppingListUpdateAction {

    String ADD_TEXT_LINE_ITEM = "addTextLineItem";

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    @JsonProperty("quantity")
    public Long getQuantity();

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyShoppingListAddTextLineItemAction of() {
        return new MyShoppingListAddTextLineItemActionImpl();
    }

    public static MyShoppingListAddTextLineItemAction of(final MyShoppingListAddTextLineItemAction template) {
        MyShoppingListAddTextLineItemActionImpl instance = new MyShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyShoppingListAddTextLineItemActionBuilder builder() {
        return MyShoppingListAddTextLineItemActionBuilder.of();
    }

    public static MyShoppingListAddTextLineItemActionBuilder builder(
            final MyShoppingListAddTextLineItemAction template) {
        return MyShoppingListAddTextLineItemActionBuilder.of(template);
    }

    default <T> T withMyShoppingListAddTextLineItemAction(Function<MyShoppingListAddTextLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
