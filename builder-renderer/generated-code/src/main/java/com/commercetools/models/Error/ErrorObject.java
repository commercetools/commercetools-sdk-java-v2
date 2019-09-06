package com.commercetools.models.Error;

import com.commercetools.models.Error.AccessDeniedError;
import com.commercetools.models.Error.ConcurrentModificationError;
import com.commercetools.models.Error.DiscountCodeNonApplicableError;
import com.commercetools.models.Error.DuplicateAttributeValueError;
import com.commercetools.models.Error.DuplicateAttributeValuesError;
import com.commercetools.models.Error.DuplicateFieldError;
import com.commercetools.models.Error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.models.Error.DuplicatePriceScopeError;
import com.commercetools.models.Error.DuplicateVariantValuesError;
import com.commercetools.models.Error.EnumValueIsUsedError;
import com.commercetools.models.Error.ExtensionBadResponseError;
import com.commercetools.models.Error.ExtensionNoResponseError;
import com.commercetools.models.Error.ExtensionUpdateActionsFailedError;
import com.commercetools.models.Error.InsufficientScopeError;
import com.commercetools.models.Error.InvalidCredentialsError;
import com.commercetools.models.Error.InvalidCurrentPasswordError;
import com.commercetools.models.Error.InvalidFieldError;
import com.commercetools.models.Error.InvalidInputError;
import com.commercetools.models.Error.InvalidItemShippingDetailsError;
import com.commercetools.models.Error.InvalidJsonInputError;
import com.commercetools.models.Error.InvalidOperationError;
import com.commercetools.models.Error.InvalidSubjectError;
import com.commercetools.models.Error.InvalidTokenError;
import com.commercetools.models.Error.MatchingPriceNotFoundError;
import com.commercetools.models.Error.MissingTaxRateForCountryError;
import com.commercetools.models.Error.NoMatchingProductDiscountFoundError;
import com.commercetools.models.Error.OutOfStockError;
import com.commercetools.models.Error.PriceChangedError;
import com.commercetools.models.Error.ReferenceExistsError;
import com.commercetools.models.Error.RequiredFieldError;
import com.commercetools.models.Error.ResourceNotFoundError;
import com.commercetools.models.Error.ShippingMethodDoesNotMatchCartError;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ExtensionBadResponseErrorImpl.class, name = "ExtensionBadResponse"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ExtensionNoResponseErrorImpl.class, name = "ExtensionNoResponse"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ExtensionUpdateActionsFailedErrorImpl.class, name = "ExtensionUpdateActionsFailed"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidCurrentPasswordErrorImpl.class, name = "InvalidCurrentPassword"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidInputErrorImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidItemShippingDetailsErrorImpl.class, name = "InvalidItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidJsonInputErrorImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidOperationErrorImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidSubjectErrorImpl.class, name = "InvalidSubject"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.MatchingPriceNotFoundErrorImpl.class, name = "MatchingPriceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.MissingTaxRateForCountryErrorImpl.class, name = "MissingTaxRateForCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.NoMatchingProductDiscountFoundErrorImpl.class, name = "NoMatchingProductDiscountFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.OutOfStockErrorImpl.class, name = "OutOfStock"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.PriceChangedErrorImpl.class, name = "PriceChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ReferenceExistsErrorImpl.class, name = "ReferenceExists"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = "ShippingMethodDoesNotMatchCart"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DiscountCodeNonApplicableErrorImpl.class, name = "DiscountCodeNonApplicable"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = "DuplicateFieldWithConflictingResource"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicatePriceScopeErrorImpl.class, name = "DuplicatePriceScope"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.models.Error.EnumValueIsUsedErrorImpl.class, name = "EnumValueIsUsed")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "code"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ErrorObject  {

   
   @NotNull
   @JsonProperty("message")
   public String getMessage();

   public void setMessage(final String message);
   


}