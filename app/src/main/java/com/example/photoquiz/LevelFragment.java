package com.example.photoquiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.photoquiz.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {

    FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnFirstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://yandex.ru/images/search?text=%D0%BA%D0%BE%D1%81%D0%B0&img_url=http%3A%2F%2Favon-wish.ru%2Fwp-content%2Fuploads%2Fb%2F4%2F2%2Fb4258079ece2acbc6441fab72921c054.jpeg&pos=7&rpt=simage&stype=image&lr=112943&parent-reqid=1659003045496641-517630749016723241-vla1-3228-vla-l7-balancer-8080-BAL-9037&source=serp");
                bundle.putString("secondImage", "https://www.scythecymru.co.uk/wp-content/uploads/2017/04/P4081519.jpg");
                bundle.putString("thirdImage", "https://proprikol.ru/wp-content/uploads/2020/11/kartinki-pshenichnoe-pole-21.jpg");
                bundle.putString("fourImage", "https://catherineasquithgallery.com/uploads/posts/2021-03/1614562690_4-p-smert-na-belom-fone-5.png");
                bundle.putString("answer", "коса");
                bundle.putString("prompt", "То что носит с собой смерть, а также косят траву");
                bundle.putString("level", "1 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnSecondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://pbs.twimg.com/media/ELpCwSDWoAEYdgP.jpg");
                bundle.putString("secondImage", "https://vsegda-pomnim.com/uploads/posts/2022-04/1649125013_1-vsegda-pomnim-com-p-priroda-kirgizii-foto-1.jpg");
                bundle.putString("thirdImage", "https://architectureguru.ru/wp-content/uploads/2015/08/7327c2fe-15dc-4d05-8eb0-c92a5.jpg");
                bundle.putString("fourImage", "https://collmart.ru/wa-data/public/shop/products/77/24/22477/images/200483/200483.970.jpg");
                bundle.putString("answer", "киргизия");
                bundle.putString("prompt", "Родина большых гор");
                bundle.putString("level", "2 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnThreeLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://phonoteka.org/uploads/posts/2021-07/1625518514_11-phonoteka-org-p-zastavka-okhota-krasivie-zastavki-11.jpg");
                bundle.putString("secondImage", "https://avatars.mds.yandex.net/get-zen_doc/198334/pub_5d6e174c028d6800ac24a639_5d6e1a15c6e2a400adda0b6f/scale_1200");
                bundle.putString("thirdImage", "https://pibig.info/uploads/posts/2022-01/1643484449_38-pibig-info-p-okhotnichii-les-priroda-krasivo-foto-53.jpg");
                bundle.putString("fourImage", "https://misanec.ru/wp-content/uploads/2022/07/aOgE6goA4N4-768x576.jpg");
                bundle.putString("answer", "охота");
                bundle.putString("prompt", "Чем занимаются браканьеры?");
                bundle.putString("level", "3 Level");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });
    }
}
