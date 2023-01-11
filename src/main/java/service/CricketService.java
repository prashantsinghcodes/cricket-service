package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Team;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.UtilConstants;

import java.util.ArrayList;
import java.util.List;

public class CricketService {

    private static Logger logger = LoggerFactory.getLogger(CricketService.class);

    public static void main(String[] args) {
        logger.info("Hello!");
        System.out.print(getTeamFromRequest());
    }



    private static List<Team> getTeamFromRequest() {
        List<Team> teamList = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(UtilConstants.json);
            if(!jsonObject.isEmpty() && jsonObject.has("teams")) {
                JSONArray teamsJsonArr = jsonObject.getJSONArray("teams");
                for(int i = 0; i < teamsJsonArr.length(); i++) {
                    ObjectMapper objectMapper = new ObjectMapper();
                    Team team = objectMapper.readValue(teamsJsonArr.getJSONObject(i).toString(), Team.class);
                    teamList.add(team);
                }
            }
        } catch (Exception ex) {

        }
        return teamList;
    }
}
