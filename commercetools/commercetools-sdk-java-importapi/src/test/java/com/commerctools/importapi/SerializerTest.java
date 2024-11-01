
package com.commerctools.importapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.commercetools.importapi.models.common.LocalizedStringBuilder;
import com.commercetools.importapi.models.common.MoneyType;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.errors.DuplicateAttributeValueError;
import com.commercetools.importapi.models.errors.ErrorResponse;
import com.commercetools.importapi.models.productvariants.*;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SerializerTest {

    @Test
    public void shouldCorrectlyDeserializeErrorWithLocalizedTextAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                                "name": "slug",
                                "value": {
                                    "en-NZ": "en-light-medium",
                                    "de-DE": "de-light-medium"
                                }
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableTextAttribute value = (LocalizableTextAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue().values().get("en-NZ")).isEqualTo("en-light-medium");
        Assertions.assertThat(value.getValue().values().get("de-DE")).isEqualTo("de-light-medium");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithDateAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                                "name": "creationDate",
                                "value": "2016-11-21"
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        TextAttribute value = (TextAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo("2016-11-21");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithTextAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                                "name": "textAttribute",
                                "value": "text"
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        TextAttribute value = (TextAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo("text");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithLTextAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                              "name": "localized-text",
                              "value":
                                {
                                  "en": "en-test",
                                  "de": "de-test"
                                }
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableTextAttribute value = (LocalizableTextAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue())
                .isEqualTo(LocalizedStringBuilder.of().values(Map.of("en", "en-test", "de", "de-test")).build());
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithBooleanAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                                "name": "booleanAttribute",
                                "value": false
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        BooleanAttribute value = (BooleanAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo(false);
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithLenumAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "color",
                               "value": {
                                  "key": "black",
                                  "label": {
                                    "en": "black",
                                    "it": "nero",
                                    "de": "schwarz"
                                  }
                               }
                             }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableEnumAttribute value = (LocalizableEnumAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo("black");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithEnumAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "style",
                               "value": {
                                  "key": "sporty",
                                  "label": "sporty"
                               }
                             }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        EnumAttribute value = (EnumAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo("sporty");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfTextAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "completeTheLook",
                               "value": [
                                 "072336",
                                 "072337",
                                 "072338",
                                 "072339",
                                 "072340",
                                 "072341"
                               ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        TextSetAttribute value = (TextSetAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue())
                .isEqualTo(Arrays.asList("072336", "072337", "072338", "072339", "072340", "072341"));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfNumberAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "test-set-number",
                               "value": [
                                 11, 12
                               ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        NumberSetAttribute value = (NumberSetAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo(Arrays.asList(11.0, 12.0));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfBooleanAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "test-set-number",
                               "value": [
                                 false, true, false
                               ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        BooleanSetAttribute value = (BooleanSetAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo(Arrays.asList(false, true, false));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfLocalizedTextAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                              "name": "localized-text-set",
                              "value": [
                                {
                                  "en": "en-test",
                                  "de": "de-test"
                                }
                              ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableTextSetAttribute value = (LocalizableTextSetAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue())
                .isEqualTo(
                    List.of(LocalizedStringBuilder.of().values(Map.of("en", "en-test", "de", "de-test")).build()));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfEnumAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                              "name": "enum-set",
                              "value": [
                                {
                                  "key": "DE",
                                  "label": "DE"
                                },
                                {
                                  "key": "EN",
                                  "label": "EN"
                                }
                              ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        EnumSetAttribute value = (EnumSetAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo(Arrays.asList("DE", "EN"));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfLenumAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                              "name": "localized-enum-set",
                              "value": [
                                {
                                   "key": "731045",
                                   "label": {
                                     "de-DE": "Titanium"
                                   }
                                 },
                                 {
                                   "key": "731046",
                                   "label": {
                                     "de-DE": "Load adapted"
                                   }
                                 }
                              ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableEnumSetAttribute value = (LocalizableEnumSetAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue()).isEqualTo(Arrays.asList("731045", "731046"));
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithSetOfReferenceAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                              "name": "state-reference-set",
                              "value": [
                                {
                                  "id" : "d3e14b2a-5848-4d86-af8a-8e9a27ca84d8",
                                  "typeId" : "state"
                                },
                                {
                                  "id" : "xxx-123-456",
                                  "typeId" : "state"
                                }
                              ]
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        ReferenceSetAttribute value = (ReferenceSetAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue().size()).isEqualTo(2);
        Assertions.assertThat(value.getValue().get(0).getKey()).isEqualTo("d3e14b2a-5848-4d86-af8a-8e9a27ca84d8");
        Assertions.assertThat(value.getValue().get(0).getTypeId().getJsonName()).isEqualTo("state");
        Assertions.assertThat(value.getValue().get(1).getKey()).isEqualTo("xxx-123-456");
        Assertions.assertThat(value.getValue().get(1).getTypeId().getJsonName()).isEqualTo("state");
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithReferenceAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "state-reference",
                               "value": {
                                 "typeId": "state",
                                 "id": "3ff4cb59-80a5-4ed2-be53-a9637fb7ffae"
                               }
                            }

                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        ReferenceAttribute value = (ReferenceAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue().getKey()).isEqualTo("3ff4cb59-80a5-4ed2-be53-a9637fb7ffae");
        Assertions.assertThat(value.getValue().getTypeId()).isEqualTo(ReferenceType.ReferenceTypeEnum.STATE);
    }

    @Test
    public void shouldCorrectlyDeserializeErrorWithCentPrecisionMoneyAttribute() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                               "name": "moneyAttribute",
                               "value": {
                                  "type": "centPrecision",
                                  "currencyCode": "EUR",
                                  "centAmount": 6490,
                                  "fractionDigits": 2
                               }
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        MoneyAttribute value = (MoneyAttribute) ((DuplicateAttributeValueError) errorResponse.getErrors().get(0))
                .getAttribute();
        Assertions.assertThat(value.getValue().getCentAmount()).isEqualTo(6490);
        Assertions.assertThat(value.getValue().getCurrencyCode()).isEqualTo("EUR");
        Assertions.assertThat(value.getValue().getFractionDigits()).isEqualTo(2);
        Assertions.assertThat(value.getValue().getType()).isEqualTo(MoneyType.CENT_PRECISION);
    }
}
