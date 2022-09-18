package JavaCore_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

        private Map<String, List<String>> phonebook_hm = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String surname, String phone_number) {
            if (phonebook_hm.containsKey(surname)) {
                phone_number_list = phonebook_hm.get(surname);
                phone_number_list.add(phone_number);
                phonebook_hm.put(surname, phone_number_list);
            } else {
                phone_number_list = new ArrayList<>();
                phone_number_list.add(phone_number);
                phonebook_hm.put(surname, phone_number_list);
            }
        }

        public List<String> get(String surname) {
            return phonebook_hm.get(surname);
        }

    }




