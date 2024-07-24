
package com.commercetools;

import com.commercetools.api.models.order.OrderSearchCustomType;
import com.commercetools.api.models.order.OrderSearchRequest;
import com.commercetools.api.models.order.OrderSearchRequestBuilder;
import com.commercetools.api.models.order.OrderSearchSortOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.json.JSONException;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class OrderQueryBuilderTest {
    @TestTemplate
    @UseDataProvider("searchBuilder")
    public void buildUnchecked(OrderSearchRequestBuilder builder, String expectedQuery)
            throws JSONException, JsonProcessingException {
        OrderSearchRequest request = builder.buildUnchecked();
        Assertions.assertThat(request).isInstanceOf(OrderSearchRequest.class);
        JSONAssert.assertEquals(expectedQuery, JsonUtils.toJsonString(request), true);
    }

    @DataProvider
    public static Object[][] searchBuilder() {
        return new Object[][] { new Object[] { OrderSearchRequest.builder()
                .withQuery(q -> q.and(b -> b
                        .addAnd(a -> a.fullText(t -> t.field("customLineItems.name").language("en").value("banana")))
                        .addAnd(a -> a.filter(f -> f
                                .plusFilter(a.exact(e -> e.field("store.name").language("en").value("fruit_store")))))))
                .plusSort(s -> s.field("customLineItems.name").language("en").order(OrderSearchSortOrder.DESC))
                .limit(50)
                .offset(0), """
                        {
                          "query": {
                            "and": [
                              {
                                "fullText": {
                                  "field": "customLineItems.name",
                                  "language": "en",
                                  "value": "banana"
                                }
                              },
                              {
                                "filter": [
                                  {
                                    "exact": {
                                      "field": "store.name",
                                      "language": "en",
                                      "value": "fruit_store"
                                    }
                                  }
                                ]
                              }
                            ]
                          },
                          "sort": [
                            {
                              "field": "customLineItems.name",
                              "language": "en",
                              "order": "desc"
                            }
                          ],
                          "limit": 50,
                          "offset": 0
                        }""" },
                new Object[] {
                        OrderSearchRequest.builder()
                                .withQuery(q -> q.and(
                                    b -> b.addAnd(a -> a.exact(t -> t.field("totalPrice.currencyCode").value("EUR")))
                                            .addAnd(a -> a.exact(t -> t.field("totalPrice.centAmount").value(2222))))),
                        """
                                {
                                   "query": {
                                     "and": [
                                       {
                                         "exact": {
                                           "field": "totalPrice.currencyCode",
                                           "value": "EUR"
                                         }
                                       },
                                       {
                                         "exact": {
                                           "field": "totalPrice.centAmount",
                                           "value": 2222
                                         }
                                       }
                                     ]
                                   }
                                 }""" },
                new Object[] { OrderSearchRequest.builder()
                        .withQuery(q -> q.exact(t -> t.field("custom.myOrderField")
                                .value("special order")
                                .customType(OrderSearchCustomType.STRING_TYPE))),
                        """
                                {
                                  "query": {
                                    "exact": {
                                      "field": "custom.myOrderField",
                                      "value": "special order",
                                      "customType": "StringType"
                                    }
                                  }
                                }""" }, };
    }
}
