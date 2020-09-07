package io.vrap.rmf.base.client;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ApiHttpHeaders {

    public static class HeaderEntry<K, V> implements Map.Entry<K, V> {
        protected final K key;
        protected V value;

        public HeaderEntry(K key) {
            this.key = key;
        }

        public HeaderEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String AUTHORIZATION = "Authorization";
    public static final String USER_AGENT = "User-Agent";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String X_CORRELATION_ID = "X-Correlation-ID";

    private List<Map.Entry<String, String>> headers;

    public ApiHttpHeaders() {
        this.headers = new ArrayList<>();
    }
    public ApiHttpHeaders(List<Map.Entry<String, String>> headers) {
        this.headers = headers;
    }
    public ApiHttpHeaders(ApiHttpHeaders t) {
        this.headers = new ArrayList<>(t.headers);
    }

    public ApiHttpHeaders addHeader(String key, String value){
        headers.add(new HeaderEntry<>(key, value));

        return this;
    }

    public ApiHttpHeaders withHeader(String key, String value) {
        return withoutHeader(key).addHeader(key, value);
    }

    @Nullable
    public String getFirst(String key){
        return this.headers.stream().filter(e -> e.getKey().equalsIgnoreCase(key)).map(Map.Entry::getValue).findFirst().orElse(null);
    }

    public List<String> getHeaderValue(String key) {
        return headers.stream().filter(e -> e.getKey().equalsIgnoreCase(key)).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public List<Map.Entry<String, String>> getHeaders(String key) {
        return headers.stream().filter(e -> e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList());
    }

    public List<Map.Entry<String, String>> getHeaders() {
        return headers;
    }

    public ApiHttpHeaders withoutHeader(String key) {
        this.headers = headers.stream().filter(e -> !e.getKey().equalsIgnoreCase(key)).collect(Collectors.toList());

        return this;
    }
}

