package optional.sample;

import java.util.Optional;

public class MobileService {

//    public int getMobileScreenWidth(Mobile mobile){
//        if(mobile != null){
//            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
//            if(dfeatures != null){
//                ScreenResolution resolution = dfeatures.getResolution();
//                if(resolution != null){
//                    return resolution.getWidth();
//                }
//            }
//        }
//        return 0;
//    }

    public int getMobileScreenWidth(Optional<Mobile> mobile){
        return mobile.flatMap(Mobile::getDisplayFeatures)
                .flatMap(DisplayFeatures::getResolution)
                .map(x -> x.getWidth())
                .orElse(0);



//        return mobile.flatMap(Mobile::getDisplayFeatures)
//                .flatMap(x-> x.getResolution())
//                .map(ScreenResolution::getWidth)
//                .orElse(0);

    }
}
