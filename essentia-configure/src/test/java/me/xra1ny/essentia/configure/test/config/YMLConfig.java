package me.xra1ny.essentia.configure.test.config;

import me.xra1ny.essentia.configs.Config;
import me.xra1ny.essentia.configs.annotation.ConfigInfo;
import me.xra1ny.essentia.configs.annotation.Property;
import me.xra1ny.essentia.configs.processor.YMLFileProcessor;

import java.util.List;
import java.util.UUID;

@ConfigInfo(name = "test.yml", processor = YMLFileProcessor.class)
public class YMLConfig extends Config {
    @Property(UUID.class)
    public UUID testUuid;

    @Property(YMLObject.class)
    public List<YMLObject> testObjectList;
}