package com.Lidiadm25.mini_erp.domain.catalog;

import com.Lidiadm25.mini_erp.domain.common.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class CatalogItem extends Entity<String> {


    private final String code;
    private final String value;
    private final int displayOrder;
    private final Map<String, Object> metadata;
    private boolean isActive;

    public CatalogItem(String id, String code, String value, int displayOrder, boolean isActive, Map<String, Object> metadata) {
        super(id);
        if(code==null || code.isEmpty()){
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        this.code = code;
        this.value = value;
        this.displayOrder = displayOrder;

        this.isActive = isActive;
        this.metadata = metadata!= null? Map.copyOf(metadata): Map.of();
    }

    public Object getMetadata(String key){
        return metadata.get(key);
    }

    public boolean hasMetadata(String key){
        return this.metadata.containsKey(key);
    }
    public void turnOffStatus(){
        this.isActive=false;
    }
    public void turnOnStatus(){
        this.isActive=true;
    }
}
