package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetDescriptionActionImpl.class)
public interface CartDiscountSetDescriptionAction extends CartDiscountUpdateAction {

    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static CartDiscountSetDescriptionActionImpl of(){
        return new CartDiscountSetDescriptionActionImpl();
    }
    

    public static CartDiscountSetDescriptionActionImpl of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

}
