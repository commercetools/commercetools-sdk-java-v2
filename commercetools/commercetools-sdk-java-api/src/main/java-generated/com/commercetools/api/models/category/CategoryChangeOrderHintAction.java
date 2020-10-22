package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryChangeOrderHintActionImpl;

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
@JsonDeserialize(as = CategoryChangeOrderHintActionImpl.class)
public interface CategoryChangeOrderHintAction extends CategoryUpdateAction {

    
    @NotNull
    @JsonProperty("orderHint")
    public String getOrderHint();

    public void setOrderHint(final String orderHint);

    public static CategoryChangeOrderHintActionImpl of(){
        return new CategoryChangeOrderHintActionImpl();
    }
    

    public static CategoryChangeOrderHintActionImpl of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionImpl instance = new CategoryChangeOrderHintActionImpl();
        instance.setOrderHint(template.getOrderHint());
        return instance;
    }

    default <T extends Accessor<CategoryChangeOrderHintAction>> T withCategoryChangeOrderHintAction(Function<CategoryChangeOrderHintAction, T> helper) {
        return helper.apply(this);
    }
}
