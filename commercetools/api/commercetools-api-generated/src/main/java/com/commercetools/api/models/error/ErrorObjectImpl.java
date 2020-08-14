package com.commercetools.api.models.error;

import com.commercetools.api.models.error.AccessDeniedError;
import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import com.commercetools.api.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.models.error.DuplicateFieldError;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.DuplicateVariantValuesError;
import com.commercetools.api.models.error.EnumValueIsUsedError;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import com.commercetools.api.models.error.ExtensionNoResponseError;
import com.commercetools.api.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.api.models.error.InsufficientScopeError;
import com.commercetools.api.models.error.InvalidCredentialsError;
import com.commercetools.api.models.error.InvalidCurrentPasswordError;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.error.InvalidInputError;
import com.commercetools.api.models.error.InvalidItemShippingDetailsError;
import com.commercetools.api.models.error.InvalidJsonInputError;
import com.commercetools.api.models.error.InvalidOperationError;
import com.commercetools.api.models.error.InvalidSubjectError;
import com.commercetools.api.models.error.InvalidTokenError;
import com.commercetools.api.models.error.LanguageUsedInStoresError;
import com.commercetools.api.models.error.MatchingPriceNotFoundError;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.OutOfStockError;
import com.commercetools.api.models.error.PriceChangedError;
import com.commercetools.api.models.error.ReferenceExistsError;
import com.commercetools.api.models.error.RequiredFieldError;
import com.commercetools.api.models.error.ResourceNotFoundError;
import com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorObjectImpl implements ErrorObject {

    private String code;
    
    private String message;

    @JsonCreator
    ErrorObjectImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = "null";
    }
    public ErrorObjectImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }

    public void setMessage(final String message){
        this.message = message;
    }

}
